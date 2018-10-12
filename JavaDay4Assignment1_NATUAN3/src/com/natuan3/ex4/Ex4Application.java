/**
 * 
 */
package com.natuan3.ex4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author User
 * @creatdate Oct 11, 2018
 * @modifieddate Oct 11, 2018
 * @content ...
 */
public class Ex4Application {

	public static void main(String[] args) {
		Map<String, String> mapContact = new HashMap<>();
		mapContact.put("Joy", "34543");
		mapContact.put("Jack", "56765");
		mapContact.put("Tina", "34567");
		
		
		//check if exists 3443 in map
		System.out.println(checkExistsNumber(mapContact, "3443"));
		
		//check if exists Jack in map
		System.out.println(checkExistName(mapContact, "Jack"));
		
		//display number of Tina
		System.out.println("Tina's number is " +mapContact.get("Tina"));
		
		//delete number of Joy
		mapContact.replace("Joy", "");
		System.out.println("---------------------------------");
		
		//display all contact
		for(Map.Entry<String, String>entry: mapContact.entrySet()) {
			System.out.println(entry.getKey() + " | " +entry.getValue());
		}
	}
	
	public static String checkExistsNumber(Map<String,String> map, String numberNeedCheck) {
		for (String number : map.values()) {
			if (number.equals(numberNeedCheck)) {
				return "3443 is exists in the contact";
			}
		}
		return "3443 is not exists in the contact";
	}
	
	public static String checkExistName(Map<String,String> map, String nameNeedCheck) {
		for(String name : map.keySet()) {
			if (name.equals(nameNeedCheck)) {
				return nameNeedCheck + " is exists in the contact";
			}
		}
		return nameNeedCheck + " is not exists in the contact";
	}
}
