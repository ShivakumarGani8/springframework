package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceConfigure implements InitializingBean, DisposableBean{
	private String confString;

	public String getConfString() {
		return confString;
	}

	public void setConfString(String confString) {
		System.out.println("Set interfaceConfigure bean properties");
		this.confString = confString;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InterfaceConfigure Bean lifecycle start");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InterfaceConfigure Bean lifecycle end");
	}
	
	
	
}
