package com.company;
import java.util.*;
import java.lang.Math;
public class Company4 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		int[] array=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			array[i]=Character.getNumericValue(s.charAt(i));
		}
		int sum=0;
		int length=s.length();
	    for(int j=0;j<s.length();j++) {
	    	sum= sum+(int) Math.pow(array[j],length);
	    }
           System.out.println(sum);
	}

}
/*Given a number 'N' print the sum of each digit to the power of number of digits in given input.
Example :
Input => 1234
=> ( 1 ^ 4 ) + ( 2 ^ 4 ) + ( 3 ^ 4 ) + ( 4 ^ 4 )
=> 1 + 16 + 81 + 256
Output => 354
N <=100000000000
Sample Testcase :
INPUT
1234
OUTPUT
354*/