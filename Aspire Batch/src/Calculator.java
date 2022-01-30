/*
 * To Demonstrate how to take INPUT, Do a Process & Give a OUTPUT.
 */

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int num1=scan.nextInt();// This line accept 1st Input from the User
		
		System.out.println("Enter the 2nd Number: ");
		int num2=scan.nextInt();// This line accept 2nd Input from the User
		
		int sum= num1+num2; //Process of ADDITION
		
		
		//Output
		
		System.out.println("Sum of 2 Numbers= "+sum);
	}

}

