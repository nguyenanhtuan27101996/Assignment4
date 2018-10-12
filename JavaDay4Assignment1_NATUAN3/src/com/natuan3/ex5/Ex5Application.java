/**
 * 
 */
package com.natuan3.ex5;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author User
 * @creatdate Oct 11, 2018
 * @modifieddate Oct 11, 2018
 * @content ...
 */
public class Ex5Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		String telephone = sc.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(telephone," -", false);
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println("Country code : "+stringTokenizer.nextToken());
			System.out.println("Area code : ("+stringTokenizer.nextToken() +")");
			System.out.println("Telphone number : "+stringTokenizer.nextToken());
		}
		
		
	}
}
