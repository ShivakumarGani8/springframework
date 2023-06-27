package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationAutowire {
	
	private Address address;
	private String tempString;
	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}
	public String getTempString() {
		return tempString;
	}
	public void setTempString(String tempString) {
		System.out.println("Setting tempString");
		this.tempString = tempString;
	}

	public AnnotationAutowire(Address address, String tempString) {
		super();
		System.out.println("Setting address and tempstring of Autowired");
		this.address = address;
		this.tempString = tempString;
	}

	public AnnotationAutowire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "AnnotationAutowire [address=" + address + ", tempString=" + tempString + "]";
	}
	
	
}
