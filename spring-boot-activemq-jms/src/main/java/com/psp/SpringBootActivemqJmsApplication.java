package com.psp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import com.psp.model.Employee;

@SpringBootApplication
public class SpringBootActivemqJmsApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootActivemqJmsApplication.class, args);
//	}
	private static final String MESSAGE_QUEUE = "message_queue";

	public static void main(String[] args)
	{
		// Launch the application
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootActivemqJmsApplication.class, args);

		// Get JMS template bean reference
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		Employee employee = new Employee();
		employee.setEmployeeId("E01");
		employee.setEmployeeNm("Panner");
		employee.setCity("Chennai");
		employee.setState("TamilNadu");
		employee.setCountry("India");
		

		// Send a message
		System.out.println("Sending a product.");
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, employee);
	}

}
