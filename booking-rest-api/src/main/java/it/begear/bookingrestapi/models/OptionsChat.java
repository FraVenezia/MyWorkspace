package it.begear.bookingrestapi.models;

import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public class OptionsChat {

	private String request;
	private MessageResponse response;

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public MessageResponse getResponse() {
		return response;
	}

	public void setResponse(MessageResponse response) {
		this.response = response;
	}

}
