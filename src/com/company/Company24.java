package com.company;
import java.util.*;
public class Company24 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);	
	String s=object.next();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||
				s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
				||s.charAt(i)=='A'||s.charAt(i)=='E'||
				s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			System.out.print(s.charAt(i));
		}
			
	}
	for(int j=0;j<s.length();j++) {
		if(s.charAt(j)!='a'&&s.charAt(j)!='e'&&
				s.charAt(j)!='i'&& s.charAt(j)!='o'&&s.charAt(j)!='u'
						&&s.charAt(j)!='A'&&s.charAt(j)!='E'&&
				s.charAt(j)!='I'&&s.charAt(j)!='O'&&s.charAt(j)!='U') {
			System.out.print(s.charAt(j));
		}
			
	}
	}

}
/*Given a string S ,print the vowels first and then consonants in the same order as they have occurred in the string.
Input Size : N <= 10000
Sample Testcase :
INPUT
GuVI
OUTPUT
uIGV*/