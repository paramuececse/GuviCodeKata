package com.company;
import java.util.*;
public class company2 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		int a=0,b=0;
		int maxi=0;
		for(int j=0;j<n;j++) {
			if(array[j]>maxi) {
				maxi=array[j];
				a=j;
			}
		}
		for(int j=0;j<n;j++) {
			if(array[j]<maxi) {
				maxi=array[j];
				b=j;
			}
		}
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.println(a-b);
	}

}
/*Given a number N and array of N integers, print the difference between the indices of smallest and largest number(if there are multiple occurances, consider the first occurance).
Input Size : |N| <= 1000000
Sample Testcase :
INPUT
5
3 5 4 4 7
OUTPUT
4*/