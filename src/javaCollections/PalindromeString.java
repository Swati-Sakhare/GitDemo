package javaCollections;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("madama");
	}
	public static void reverseString(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		if(s.equals(reverse)) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String is not a Palindrome");
		}
	}

}
