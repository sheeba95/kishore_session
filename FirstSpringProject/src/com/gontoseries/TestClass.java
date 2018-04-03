package com.gontoseries;

import javax.imageio.spi.RegisterableService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant res = (Restaurant) context.getBean("restaurantBean");		
		res.greetCustomer();
	
	}

}
