package com.java;

public class Loops {

	public static void main(String args[]) {
		
		
		//for loop
		int start=1, end=100;
		for(int i=start;i<=end;i++)
		{
			System.out.println("This is for loop: "+i);
		}
		
		//while loop
		int a=start;
		while(a<=end) {
			System.out.println("This is while loop: "+a);
			a++;
		}
		
		//do-while loop
		int b=start;
		do {
			System.out.println("This is do-while loop: "+b);
			b++;
			
		}while(b<=end);
		
	}
}
