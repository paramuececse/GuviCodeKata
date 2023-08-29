package com.company;
import java.util.*;
public class Company22 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+array[i];
		}
 System.out.println(sum);
	}

}
/*Given a number N followed by N numbers(negative or positive) print the maximum sum of any subarray of the array.
Input Size : 1 <= N <= 100000
Sample Testcases :
INPUT
7
1 2 3 4 5 6 7
OUTPUT
28*/