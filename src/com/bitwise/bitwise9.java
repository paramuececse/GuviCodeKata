package com.bitwise;
import java.util.*;
public class bitwise9 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int N=object.nextInt();
	int[] array=new int[N];
	for(int i=0;i<N;i++) {
		array[i]=object.nextInt();
	}
	long value=0;
	for(int i=0;i<N;i++) {
		value=value|array[i];
	}
	System.out.print(value);
	}

}
/*Given a number N and an array of N integers, find the maximum of Bitwise OR of all segments.
Input Size : N <= 100000
Sample Testcase :
INPUT
2
2 4
OUTPUT
6*/