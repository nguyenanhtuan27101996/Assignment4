/**
 * 
 */
package com.natuan3.ex2;

/**
 * @author User
 * @creatdate Oct 11, 2018
 * @modifieddate Oct 11, 2018
 * @content ...
 */
public class Ex2Util {
	
	public long getFactorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n  * getFactorial(n - 1);
	}

}
