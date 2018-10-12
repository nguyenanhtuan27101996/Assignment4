/**
 * 
 */
package com.natuan3.ex1;

import java.util.Scanner;

/**
 * @author User
 * @creatdate Oct 11, 2018
 * @modifieddate Oct 11, 2018
 * @content ...
 */
public class Ex1Application {
	
	public static void main(String[] args) {
		Ex1Util ex = new Ex1Util();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to compute  : ");
		double number= sc.nextDouble();
		System.out.println("Square is " +ex.getSquare(number));
		System.out.println("Exponent of three is " +ex.getThreeExponention(number));
	}
}
