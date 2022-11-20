package com.bridgelabz.workshop;
import java.util.*;

public class PalindromeNumber {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to check:");
		
		int number = scan.nextInt();
		
		int temp = number;
		
		int reverse=0;
		
		while(number>0) {
			
			reverse = reverse*10 + number%10;
			
			number = number/10;
		}
		
		if(temp == reverse) {
			
			System.out.println("The given number is palindrome");
		}
		else {
			
			System.out.println("The given number is not a palindrome");
		}
		scan.close();
	}
	
}
