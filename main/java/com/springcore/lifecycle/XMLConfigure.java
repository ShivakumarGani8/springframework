package com.springcore.lifecycle;

public class XMLConfigure {
	private String tempString;

	public void setTempString(String tempString) {
		System.out.println("Set XMLConfigure Bean properties");
		this.tempString=tempString;
	}
	public String getTempString() {
		return tempString;
	}
	
	public void init() {
		System.out.println("XMLConfigure Bean lifecycle start");
	}
	public void destroy() {
		System.out.println("XMLConfigure Bean lifecycle ends");
	}
	
}
