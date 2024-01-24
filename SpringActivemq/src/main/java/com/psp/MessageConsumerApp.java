package com.psp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.psp.config.AppConfig;
import com.psp.config.recevier.MessageReceiver;
import com.psp.model.Product;

public class MessageConsumerApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
		String response = messageReceiver.receiveMessage();
		System.out.println("Message Received = " + response);
		
		Product product = messageReceiver.receiveMessage1();
		System.out.println("Message Received = " + product);
	
		

		((AbstractApplicationContext) context).close();
	}
}
