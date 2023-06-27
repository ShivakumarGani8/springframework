package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/config.xml");
		StandAlone std1= context.getBean("standalone1",StandAlone.class);
		System.out.println(std1);
		System.out.println("List class : "+std1.getAddressList().getClass().getName());
		System.out.println("Set class : "+std1.getPhoneNumber().getClass().getName());
		System.out.println("Map class :"+std1.getCourses().getClass().getName());
	}
}
