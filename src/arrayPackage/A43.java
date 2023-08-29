package arrayPackage;
import java.util.Arrays;
import java.util.Scanner;
public class A43 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		
		int arr2=object.nextInt();
		int[] array2=new int[arr2];
		
		for(int i=0;i<arr2;i++) {
			array2[i]=object.nextInt();
			//System.out.print(array2[i]+" ");
		}
		
		int arr6=object.nextInt();
		int[] array6=new int[arr6];

		for(int j=0;j<arr6;j++) {
			array6[j]=object.nextInt();
		}
		int arr1=object.nextInt();
		int[] array1=new int[arr1];
		
		
		for(int z=0;z<arr1;z++) {
			array1[z]=object.nextInt();
		}
			
		Arrays.sort(array2);
		Arrays.sort(array6);
		Arrays.sort(array1);
		for(int i=0;i<arr2;i++) {
		System.out.print(array2[i]+" ");
			
		}
		for(int i=0;i<arr6;i++) {
			System.out.print(array6[i]+" ");
				
			}
		for(int i=0;i<arr1;i++) {
			System.out.print(array1[i]);
				
			}
	}

}
/*You are an intern at GUVI and the company wants to organise its data and delete unnecessary extra storage elements used. You are given k arrays of unequal dimensions. Sort the k arrays individually and concatenate them.
 

Input Description:
First line contains the number of arrays. Subsequent lines contain the size of the array followed by the elements of the array.

Output Description:
An array containing the sorted elements of k sorted arrays

Sample Input :
3
2
98 12
6
1 2 3 8 5 9
1
11
Sample Output :
12 98 1 2 3 5 8 9 11*/