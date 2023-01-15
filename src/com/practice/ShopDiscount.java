package com.practice;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int units = sc.nextInt();
		
		int allUnitCost=units*100;
		
		if(allUnitCost > 1000) {
			
			
			
			System.out.println((allUnitCost-(allUnitCost/10)));
			
			
			
			
		}
		else {
			System.out.println(allUnitCost);
		}
		

	}

}
