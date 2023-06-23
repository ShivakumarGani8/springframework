package com.springcore.reportgenerator;

import java.util.Map;

public class Student{
	
	private String name;
	private int rollNo;
	private Map<String,Integer> subjects;
	private int maxMarks;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Map<String, Integer> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", subjects=" + subjects + ", maxMarks=" + maxMarks
				+ "]";
	} 
	
}
