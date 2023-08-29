package com.bitwise;
import java.util.*;
public class bitwise7 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		int m;
		m=N<<K;
		System.out.println(m);

	}


	}


/*Given 2 numbers N,K print the number after performing bitwise left shift 'K' times.
Input Size : 1 <= N, K <= 1000
Sample Testcase :
INPUT
5 2
OUTPUT
20*/