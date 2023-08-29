package com.company;
import java.util.*;
public class Company10 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		int j;
		for( j=n-1;j>0;j--) {
			System.out.print(array[j]+"->");
		}
System.out.print(array[j]);
	}

}
/*Given a number N followed by a list of N numbers. Write a program to reverse the list and print the list.
Input Size : 1 <= N <= 10000
Sample Testcases :
INPUT
7
1 2 3 4 5 6 7
OUTPUT
7->6->5->4->3->2->1*/