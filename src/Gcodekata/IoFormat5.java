package Gcodekata;

import java.util.Scanner;

public class IoFormat5 {
	
		public static void main(String[] args){
		Scanner object=new Scanner(System.in);
//		System.out.println("Enter the array size:");
		
		//int array_size=object.nextInt();
		int[] array=new int[3];
//		System.out.println("Enter the array element:");
		
		for(int i=0;i<3;i++) {
			array[i]=object.nextInt();
		}

		for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i] + " ");
		}
			System.out.print(array[2]);
		}
	}
/* */

/* Write a code to get the input in the given format and print the output in the given format

Input Description:
Three integers are given in line by line.

Output Description:
Print the integers in a single line separate by space.

Sample Input :
2
4
5
Sample Output :
2 4 5 */