package com.example.receiveTesting;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class ReceiveTestingApplication {

	public static void main(String[] args) throws JMSException {
		ApplicationContext ctx = SpringApplication.run(ReceiveTestingApplication.class, args);
		
		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		//time taken to receive a message
		System.out.println("\nTime taken to receive the messsage: "+jms.getReceiveTimeout());
		
		Message msg = jms.receive("MyQueue");
		TextMessage txt = (TextMessage) msg;
		
		System.out.println("\nReceiving message from message broker: " + txt.getText());
	}

}
