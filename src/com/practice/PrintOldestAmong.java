package com.practice;

import java.util.Scanner;

public class PrintOldestAmong {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		
		if(x > y && x > z) {
			
			System.out.println("A");
		}
		else if( y > z) {
			
			System.out.println("B");
		}
		else {
			System.out.println("C"); 
		}
		
		
		

	}

}
