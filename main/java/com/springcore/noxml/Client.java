package com.springcore.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Bean with @Component Annotation
		WithComponent obj1= con.getBean("withComponent",WithComponent.class);
		System.out.println(obj1);
		//Bean without @Component Annotation
		WithoutComponent obj2= con.getBean("getObject",WithoutComponent.class);
		System.out.println(obj2);
	}
}
