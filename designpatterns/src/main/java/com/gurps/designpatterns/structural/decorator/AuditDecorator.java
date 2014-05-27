package com.gurps.designpatterns.structural.decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Decorates message with audit information
 * @author gurps
 *
 */
public class AuditDecorator extends BaseMessageDecorator{

	public AuditDecorator(Message message){
		super(message);
	}
	
	public String getPayload() {
		DateFormat df = new SimpleDateFormat("ddMMyyyy");
		String currentDate = df.format(new Date());
		
		StringBuilder originalPayload = new StringBuilder(originalMessage.getPayload());
		originalPayload = originalPayload.insert(originalPayload.indexOf("<root>") + 6, "<dateLogged>" + currentDate + "</dateLogged>");
		
		return originalPayload.toString();
	}

}
