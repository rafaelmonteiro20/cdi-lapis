package com.lapis.util;

import static javax.faces.application.FacesMessage.SEVERITY_INFO;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

public class MessagesHelper {

	@Inject
	private FacesContext context;
	
	public void addInfoMessage(String message) {
		context.addMessage(null, createFacesMessage(SEVERITY_INFO, message));
	}
	
	private FacesMessage createFacesMessage(Severity severity, String message) {
		return new FacesMessage(severity, message, null);
	}
	
}