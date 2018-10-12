/**
 * 
 */
package com.natuan3.ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author User
 * @creatdate Oct 11, 2018
 * @modifieddate Oct 11, 2018
 * @content ...
 */
public class Ex3Application {
	
	public static void main(String[] args) {
		List<Double> listNumbers = getInputFromUser();
		double maxOfListNumbers = Collections.max(listNumbers);
		double minOfListNumbers = Collections.min(listNumbers);
		
		System.out.println("Square of max number is :  " +Math.pow(maxOfListNumbers, 2));
		System.out.println("Square of min number is :  " +Math.pow(minOfListNumbers, 2));
		
	}
	public static List<Double> getInputFromUser(){
		List<Double> listNumbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter amount of numbers : ");
		int amountOfNumbers = sc.nextInt();
		for (int i = 0; i < amountOfNumbers; i++) {
			System.out.println("Enter number " + (i + 1 + " "));
			listNumbers.add(sc.nextDouble());
		}
		return listNumbers;
	}
}
