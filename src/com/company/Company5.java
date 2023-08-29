package com.company;
import java.util.*;
public class Company5 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				System.out.print(1+" ");
				if(i>n)
					m=2;
			}
			
			//System.out.print(1);
			System.out.println();
		}

	}

}
/*Given a number N print a right angled traingle structure with the starting level as single 1 and every immediate proceeding level with 2 more additional ones than the previous level .Repeat the pattern for N levels.
Input Size : N <= 1000
Sample Testcase :
INPUT
3
OUTPUT
1
1 1 1
1 1 1 1 1*/