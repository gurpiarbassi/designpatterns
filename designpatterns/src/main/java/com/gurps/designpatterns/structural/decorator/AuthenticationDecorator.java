package com.gurps.designpatterns.structural.decorator;

/**
 * Decorates message with authentication information
 * @author gurps
 *
 */
public class AuthenticationDecorator extends BaseMessageDecorator{

	private String username;
	private String password;
	
	public AuthenticationDecorator(Message message, String username, String password){
		super(message);
		this.username = username;
		this.password = password;
		
	}
	
	/**
	 * Get the payload of the original message and add the authentication information to it.
	 */
	public String getPayload() {
		
		StringBuilder builder = new StringBuilder();
		String authInfo = 
				builder.append("<auth>")
					   .append("<user>")
					   .append(this.username)
					   .append("</user>")
					   .append("<password>")
					   .append(this.password)
					   .append("</password>")
					   .append("</auth>")
					   .toString();
		
		StringBuilder originalPayload = new StringBuilder(originalMessage.getPayload());
		originalPayload = originalPayload.insert(originalPayload.indexOf("<root>") + 6, authInfo);
		
		return originalPayload.toString();
	}	
}
