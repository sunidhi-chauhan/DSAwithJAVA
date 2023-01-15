package com.practice;

import java.util.Scanner;

public class Day3 {
	
	
//	int a=10; //Instance or non-static variable
//	static int b=20; //static or class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Day3 obj=new Day3();
//		
//		
//		
//		System.out.println(b);
//		System.out.println(obj.a);
		
		Scanner sc=new Scanner(System.in);
		
		int a= sc.nextInt();
		
		int b= sc.nextInt();
		
		int c=sc.nextInt();
		
		int max=a;
		
		if(b>max)
		{
			max=b;
		}
		if(c>max)
		{
			max=c;
		}
		
		
//		int res=Math.max(a,Math.max(a,b));
		
//		System.out.println(res);
		System.out.println(max);
	}

	
	
	
}
