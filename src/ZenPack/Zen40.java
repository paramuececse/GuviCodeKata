package ZenPack;

import java.util.Arrays;
import java.util.Scanner;

public class Zen40 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		int[] temp=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			temp[i]=array[i];
			
		}
		int smallest=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]<smallest) {
				smallest=array[i];
			}
		}
		Arrays.sort(array);
		int secondsmallest=array[n-1];
		
		for(int i=0;i<n;i++) {
			if(array[i]!=smallest && array[i]<secondsmallest ) {
				secondsmallest=array[i];
				
			}
		}
		int index=0;
		for(int i=0;i<n;i++) {
			if(temp[i]==secondsmallest) {
				i=index;
			}
		}
		//System.out.println(smallest);
		//System.out.println(secondsmallest);
		System.out.println(index+1);
	}

}
/*Given a number n followed by n numbers Print the index 2nd  smallest number in an array (1 base index)

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the smallest number index in an array

Sample Input :
6
5 7 4 4 6 8
Sample Output :
1*/