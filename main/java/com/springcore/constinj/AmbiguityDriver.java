package com.springcore.constinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constinj/ambiguity.xml");
		ConstAmbiguity ambiguity1=(ConstAmbiguity) context.getBean("multiply1");
		ambiguity1.doMultiply();
		ConstAmbiguity ambiguity2=(ConstAmbiguity) context.getBean("multiply2");
	}
}
