package com.practice;

import java.util.Scanner;

public class GreadTheStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int marks =sc.nextInt();
		
		if(marks>90) {
			
			System.out.println("Excellent");
		}
		else if(marks>80 &&marks<=90) {
			
			System.out.println("Good");
		}
		else if(marks>70) {
			
			System.out.println("fair");
		}
		else if(marks>60) {
			
			System.out.println("meets expectations");;
		}
		else {
			System.out.println("failed");
		}
		
		
		

	}

}
