package com.practice;

import java.util.Scanner;

public class ToggleTheString {

	public static void main(String[] args) {
		
		
		Scanner sc  =new Scanner(System.in);
		
		String st = sc.nextLine();
		String ans="";
		
		for(int i=0; i<st.length(); i++) {//till 0-17
			//Super MAN is Good
			
			char ch = st.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				
				ch= Character.toUpperCase(ch);
			}
			else {
				
				ch= Character.toLowerCase(ch);
			}
			ans+=ch;
	
		}
		System.out.println(ans);

	}

}
