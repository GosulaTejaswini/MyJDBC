package com.java;

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Java program");
		int a=40,b=10,c=40;
		int d=(a>=b)?((a>=c)?a:c):((b>=c)?c:b);
		System.out.println(d);

	}

}
