package com.java;

public class SwitchCase_Example {

	public static void main(String[] args) {
			
			int choice=1;
			
			
			switch(30/10)
			{
			case 1: System.out.println("Sunday");
					break;
			case 2: System.out.println("Monday");
					break;	
			
			case 3: System.out.println("Tuesday");
					break;
			default:System.out.println("Wrong choice!!");
					
			}
			int choice1=3;
			
			
			switch(40/10)
			{
				case 1: System.out.println("Sunday");
						break;
				case 2: System.out.println("Monday");
						break;	
				//Multiple values per case
				case 3, 4, 5: System.out.println("Tuesday");
						break;
				default:System.out.println("Wrong choice!!");
					
			}
			
			//Switch can be used as  an expression
			String st=switch(choice1){
			
			case 1: yield "Sunday";
			case 2: yield "Monday";
			case 3: yield "Tuesday";
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			
			};
			
			System.out.println(st);
			
			//Switch with arrow
			switch(choice1)
			{
			case 1 ->  System.out.println("Sunday");
			case 2 ->  System.out.println("Monday");
			case 3 ->  System.out.println("Tuesday");
			}

		

		}

	}
