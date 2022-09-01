package com.Dsa;

public class ErrrorInCode {

	public static void main(String[] args) {
		byte b=50;
		//b=b*50;//* operator has converted b * 50 into int,
		//which can not be converted to byte without casting.
		b=(byte)(b*50);
		System.out.println(b);

	}

}
