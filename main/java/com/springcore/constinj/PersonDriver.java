package com.springcore.constinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constinj/constInj.xml");
		Person person1=(Person) context.getBean("person1");
		System.out.println(person1);
		Person person2=(Person)context.getBean("person2");
		System.out.println(person2);
		Person person3=(Person)context.getBean("person3");
		System.out.println(person3);

	}

}
