package com.springcore.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/beanscope/config.xml");
		//Bean with singleton scope using xml
		BeanScope scope1= context.getBean("scope1",BeanScope.class);
		BeanScope scope2= context.getBean("scope1",BeanScope.class);
		if(scope1.getHashCode()==scope2.getHashCode()) {
			System.out.println("**XML** Both the objects are same");
		}else {
			System.out.println("**XML** Both the objects are different");
		}
		
		//Bean with prototype scope using xml
		BeanScope scope3= context.getBean("scope2",BeanScope.class);
		BeanScope scope4=context.getBean("scope2",BeanScope.class);
		if(scope3.getHashCode()==scope4.getHashCode()) {
			System.out.println("**XML** Both the objects are same");
		}else {
			System.out.println("**XML** Both the objects are different");
		}
		
		//Bean with singleton scope using stereotype annotation
		StereoTypeBean scope5= context.getBean("beanObject",StereoTypeBean.class);
		StereoTypeBean scope6= context.getBean("beanObject",StereoTypeBean.class);
		if(scope5.getHashCode()==scope6.getHashCode()) {
			System.out.println("**Stereotype** Both the objects are same");
		}else {
			System.out.println("**Stereotype** Both the objects are different");
		}
	}
}
