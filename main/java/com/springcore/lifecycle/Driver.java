package com.springcore.lifecycle;
 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		XMLConfigure configure1=(XMLConfigure) context.getBean("configure1");
		System.out.println(configure1.getTempString());

		//Registering destroy hook
		context.registerShutdownHook();
		
		InterfaceConfigure configure2=(InterfaceConfigure) context.getBean("configure2");
		System.out.println(configure2.getConfString());
	}
}
