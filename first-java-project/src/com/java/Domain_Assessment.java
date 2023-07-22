package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InAmsterdam{
	 static void countOccurence(String s,String w)
	{
		String[] temp=s.split(" ");
		int count=0;
		for(int i=0;i<temp.length;i++)
		{
			if(w.compareToIgnoreCase(temp[i])==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
public class Domain_Assessment {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader buf=new BufferedReader(r);
		System.out.println("Enter a Sentence");
		String sen=buf.readLine();
		System.out.println("Enter a Word");
		String word=buf.readLine();
		
		InAmsterdam.countOccurence(sen, word);

	}

}
