package com.bitwise;
import java.util.*;
public class bitwise8 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		int m;
		m=N>>K;
		System.out.println(m);

	}

}
/*Given 2 numbers N and K print the number after performing bitwise right shift 'K' times(upto 2 decimal places).
Input Size : 1 <= N, K <= 1000
Sample Testcase :
INPUT
5 2
OUTPUT
1*/