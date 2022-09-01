/*Write a program to input a name(as a single character) 
 and marks of three tests as m1, m2, and m3 of a student considering all the 
 three marks have been given in integer format.
 Now, you need to calculate the average of the given marks and print it along 
with the name as mentioned in the output format section.
All the test marks are in integers and hence calculate the average in integer as well.
 That is, you need to print the integer part of the average only and neglect the decimal
  part.*/


package com.Dsa;
import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		char name=scan.next().charAt(0);
		
		int m1,m2,m3;
		
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
		
		int avg=(m1+m2+m3)/3;
		
		System.out.println(name);
		System.out.println(avg);

	}

}
