package com.psp.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.psp.model.Employee;

@Component
public class MessageReceiver {
	private static final String MESSAGE_QUEUE = "message_queue";

	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Employee employee) throws InterruptedException {
		Thread.sleep(300);
		System.out.println("Received " + employee);
	}
}
