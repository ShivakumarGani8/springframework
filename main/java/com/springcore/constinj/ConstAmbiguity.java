package com.springcore.constinj;

public class ConstAmbiguity {
	private int a;
	private int b;
	public ConstAmbiguity(String a, String b ) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor args : String , String");
	}
	public ConstAmbiguity(double a, int b) {
		this.a=(int)a;
		this.b=b;
		System.out.println("Constructor args : double , int");
	}
	public ConstAmbiguity(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor args : int , int");
	}
	
	public void doMultiply() {
		System.out.println("The multiplied value of a & b is :"+a*b);
	}

}
