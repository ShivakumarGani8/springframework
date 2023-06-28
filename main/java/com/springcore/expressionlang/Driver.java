package com.springcore.expressionlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext con=
		new ClassPathXmlApplicationContext("com/springcore/expressionlang/config.xml");
		ExpressionLanguage bean = con.getBean("expressionLanguage",ExpressionLanguage.class);
		System.out.println(bean);
	}
}
