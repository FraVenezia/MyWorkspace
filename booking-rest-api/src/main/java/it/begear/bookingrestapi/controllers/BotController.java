package it.begear.bookingrestapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

@CrossOrigin(origins = { "http://localhost:9000" }, maxAge = 3000)
@RestController
public class BotController {

	public final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@PostMapping("bot")
	public MessageResponse ChatBot(@RequestBody String request) {
		LOGGER.info("sono in ChatBot");
		Conversation service = new Conversation("2018-07-26");
		service.setUsernameAndPassword("af180e54-1524-4403-aaa3-d4c0fee21bb3", "J2soLiLudxjC");
		String workspaceId = "78e601a1-e72f-48a9-b812-f18c6cd5ea12";
		InputData input = new InputData.Builder(request).build();
		MessageOptions options = new MessageOptions.Builder(workspaceId).input(input).build();
		MessageResponse response = service.message(options).execute();
		return response;
	}

}
