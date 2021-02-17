package com.example.receiveTesting;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceive {
	
	@JmsListener(destination = "MyQueue")
	public void processMessage(String message) {
		
		System.out.println("Attempting to process a message...............");
		
		//This method is taking long to process
		
		//crash happens
		//re-attempting
		
		  if(0==0) { 
			  System.out.println("Crashed!!!!!!");
			  throw new RuntimeException("REDEPLOYMENT-STOPPED");
		  }
		 
		
		//End result
		System.out.println("Message: " + message);
		
	}

}
