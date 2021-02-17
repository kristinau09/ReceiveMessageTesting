package com.example.receiveMessageTesting;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceive {
	
	@JmsListener(destination = "MyQueue")
	public void processMessage(String message) {
		
		System.out.println("Attempting to process a message...............");
			
		//End result
		System.out.println("Message: " + message);
		
	}

}
