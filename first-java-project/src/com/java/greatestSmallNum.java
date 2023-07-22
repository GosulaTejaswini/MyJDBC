package com.java;

import java.util.Arrays;
import java.util.Scanner;


public class greatestSmallNum {

	int great(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
		
	}
	public static void main(String[] args) {

	
		greatestSmallNum obj=new greatestSmallNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int result=obj.great(a);
		System.out.println(result);
		
	}

}
