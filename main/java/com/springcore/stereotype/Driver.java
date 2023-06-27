package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Car car=context.getBean("carObject",Car.class);
		System.out.println(car);
	}
}
