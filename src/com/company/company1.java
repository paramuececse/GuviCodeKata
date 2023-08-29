package com.company;
import java.util.*;
public class company1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int array[]=new int[n];
		int k=object.nextInt();
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		if(method(array,n,k)=="yes") {
		      System.out.println("yes");	
		}else {
			System.out.println("no");
		}
		
	}

	public static String method(int[] array,int n, int k) {
		for(int j=0;j<n;j++) {
			if(array[j]==k) {
				return "yes";
			}
		}
		return "no";

		
	}

}
/*Given 2 numbers N,K and an array of N integers, find if the element K exists in the array.
Input Size : N <= 100000
Sample Testcase :
INPUT
5 2
1 2 3 4 5
OUTPUT
yes
HINT: Read about Binary Search*/