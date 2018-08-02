package it.begear.bookingrestapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import it.begear.bookingrestapi.models.OptionsChat;

@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class BotController {

	public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	private MessageOptions options;
	private Conversation  service;
	private final String USERNAME="fd9736ac-06d4-4d08-a367-92c56cb66279";
	private final String PASSWORD="WctSkRcVDi61";
	private final String WORKSPACES_ID="11f1a0a8-f74d-4c9a-aad5-632f1c421486";

	@GetMapping("botGo")
	public MessageResponse ChatBotGo() {
		LOGGER.info("Avvio ChatBot");
		service = new Conversation("2018-07-26");
		service.setUsernameAndPassword(USERNAME,PASSWORD);
		options = new MessageOptions.Builder(WORKSPACES_ID).build();
		MessageResponse response = service.message(options).execute();
		return response;
	}

	@PostMapping("bot")
	public MessageResponse ChatBot(@RequestBody OptionsChat optionsChat) {
		LOGGER.info("Continuo ChatBot");
		InputData input = new InputData.Builder(optionsChat.getRequest()).build();
		options=options.newBuilder().input(input).context(optionsChat.getResponse().getContext()).build();
		MessageResponse response = service.message(options).execute();
		return response;
	}

}
