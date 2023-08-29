package arrayPackage;
import java.util.Scanner;
public class A23 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
		array[i]=object.nextInt();
	}
	for(int j=0;j<n;j++) {
	 
	}
	
}
}
/*You are given with a list of size ‘n’. The list is imposed with a condition that all elements must be of range 0 to n-1.Your task is to rearrange the numbers such that arr[i] becomes arr[arr[i]].

Input Description:
You are given size of array ‘n’.n space separated numbers in next line.

Output Description:
Print all elements after rearranging.

Sample Input :
5
4 0 2 1 3
Sample Output :
3 4 2 0 1*/