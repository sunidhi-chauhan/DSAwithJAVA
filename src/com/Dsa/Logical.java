package com.Dsa;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
	 int a=s.nextInt();
	 int b=s.nextInt();
	 int c=s.nextInt();
	 
	 boolean largest=((a>=b)&&(a>=c));
	 
	 System.out.println(largest);
	 System.out.println(!(a>=b));
	 
	}

}
