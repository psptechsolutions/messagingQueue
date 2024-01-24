package com.psp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.psp.config.AppConfig;
import com.psp.config.producer.MessageSender;
import com.psp.model.Product;

public class MessageProducerApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageSender messageSender = context.getBean(MessageSender.class);

		messageSender.sendMessage("Hi Syed, How are you?");
		
		
		Product product = new Product();
		product.setProductId(100);
		product.setName("Laptop");
		product.setQuantity(10);
		
		messageSender.sendMessage1(product);
		
		System.out.println("Message has been sent successfully...");

		((AbstractApplicationContext) context).close();
	}
}
