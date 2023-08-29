package arrayPackage;
import java.util.*;
public class a196 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int k=object.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
		array[i]=object.nextInt();
	}
	int i;
	for( i=0;i<n-1;i++) {
		if(array[i]!=k) {
			System.out.print(array[i]+" ");
		}
	}
	System.out.print(array[i]);
	}

}
/*Given 2 numbers N and K and followed by an array of N integers. The given element K is removed from the array and new array is printed. If after removing every occurance of K the array becomes empty, print 'empty' without quotes.
Example:
Input: {10,10,20,30,76}, K=10
Output: {20,20,76}
Input Size : N <= 100000
Sample Testcase :
INPUT
5 10
10 10 20 30 76
OUTPUT
20 30 76*/