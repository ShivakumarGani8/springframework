package com.springcore.refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/refinjection/refconfig.xml");
		Engine engine1=(Engine)context.getBean("engine1");
		System.out.println(engine1);
		
		//With property & value injection
		Car car1=(Car)context.getBean("car1");
		System.out.println("------------Special Edition----------------");
		System.out.println(car1);
		System.out.println();
		System.out.println("------------Common Edition---------------");
		//With p-schema injection
		Car car2=(Car)context.getBean("car2");
		System.out.println(car2);
		
	}

}
