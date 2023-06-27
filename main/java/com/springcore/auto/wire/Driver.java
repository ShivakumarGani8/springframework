package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Employee emp1= context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		AnnotationAutowire emp2= context.getBean("emp2",AnnotationAutowire.class);
		System.out.println(emp2);
	}
	
}
