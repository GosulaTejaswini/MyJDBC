package com.java;

public class Variable_Example {

	int b=45;// instance Variable
	static int c=23;// static variables
	public static void main(String[] args) {
		
		//Local Variables or Regular Variables
		int a=10;
		char ch='A';
		boolean flag=true;
		final int d=30; // final variable
		
		Variable_Example ob1= new Variable_Example();
		Variable_Example ob2= new Variable_Example();
		Variable_Example ob3=new Variable_Example();
		
ob1.c=10;
ob2.c=20;
ob3.c=40;

System.out.println(ob1.b);
System.out.println(ob1.c+" "+ob2.c+" "+ob3.c);

	}

}
