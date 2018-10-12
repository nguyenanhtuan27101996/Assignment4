/**
 * 
 */
package com.natuan3.ex6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author User
 * @creatdate Oct 11, 2018
 * @modifieddate Oct 11, 2018
 * @content ...
 */
public class Ex6Application {
	public static void main(String[] args) {
		FileReader fileRead = null;
		FileWriter fileWrite = null;
		try {
			fileRead=new FileReader("D:\\text1.txt");
		    fileWrite = new FileWriter("D:\\text2.txt");
		    
			int count = fileRead.read();
			while(count != -1) {
				fileWrite.write(count);
				count = fileRead.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileRead.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fileWrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
