package arrayPackage;

import java.util.Scanner;
public class A5{
public static void main(String[] args) {
	Scanner object =new Scanner(System.in);
	String s=object.next();
	int[] array=new int[s.length()];
	
	for(int i=0;i<array.length;i++) {
		
			array[i]=Character.getNumericValue(s.charAt(i));
		}
	int j;
	for( j=0;j<array.length-1;j++) {
		if(array[j]==array[j+1]) {
			j=j+1;
		}
		else {
			System.out.print(array[j]);
		}
		
		}
	System.out.print(array[j]);
	
	
	
}
}
/*You are given a number with duplicate digits your task is to remove the immediate duplicate digits and print the result

Input Description:
You are given a long string of digits

Output Description:
Print the desired result print -1 if result length is 0

Sample Input :
1331
Sample Output :
11*/