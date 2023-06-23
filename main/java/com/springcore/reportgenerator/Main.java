package com.springcore.reportgenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Printable;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/reportgenerator/reportconfig.xml");
		Main main=new Main();
		Person person1=(Person)context.getBean("person1");
		System.out.println();
		System.out.println("Name : "+person1.getName());
		System.out.println("Age : "+person1.getAge());
		System.out.println();
		System.out.println("------Result Scored---------");
		main.printResult(person1.getOccupation());
		
		Person person2=(Person)context.getBean("person2");
		System.out.println();
		System.out.println("Name : "+person2.getName());
		System.out.println("Age : "+person2.getAge());
		System.out.println();
		System.out.println("------Result Scored---------");
		main.printResult(person2.getOccupation());
	}
	
	public void printResult(Student student1) {
		Map<String,Integer> subjects= student1.getSubjects();
		Iterator<String> iterator= subjects.keySet().iterator();
		System.out.println(" ________________________________");
		System.out.println("|   Subjects      |     Marks    |");
		System.out.println("|_________________|______________|");
		double totalMarks=0;
		while(iterator.hasNext()) {
			String key=iterator.next();
			int marks=subjects.get(key);
			totalMarks+=marks;
			while(key.length()<15)
				key+=" ";
			System.out.println("|  "+key+"|      "+marks+"      |");
		}
		System.out.println("|_________________|______________|");
		System.out.println("|    Total        |     "+totalMarks+"    |");
		System.out.println("|_________________|______________|");
		System.out.println("|        %        |     "+(totalMarks*100)/student1.getMaxMarks()+"     |");
		System.out.println("|_________________|______________|");
	}

}
