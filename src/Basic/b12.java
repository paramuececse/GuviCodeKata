package Basic;
import java.util.Scanner;

import java.io.*;

public class b12 {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		
		long a=(int)(Math.log(N)/Math.log(2));
		
		if(Math.pow(2, a)==N && N!=32) {
			System.out.println(N);
		}
		else {
			int d=(int) Math.pow(2, a + 1);
			System.out.println(d);
		}
}
}
// This code is contributed by Ajax



/*Write a code to get a integer n as input and calculate the smallest perfect power of 2 greater than n.

Input Description:
A single line containing an integer,n.

Output Description:
Print the smallest perfect power of 2 greater than n.

Sample Input :
48
Sample Output :
64*/