package com.practice;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//a 1 A
		
		char small ='a';
		char upper = 'A';
		
		for(int i=1;i<=n;i++) {
			
			
			System.out.println(small+ " "+i+" "+upper); //a 1 A
			small++;
			upper++;
		}

	}

}
