package arrayPackage;
import java.util.*;
public class A30 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array1=new int[n];
		int[] array2=new int[n];
		
		for(int i=0;i<array1.length;i++) {
			array1[i]=object.nextInt();
		}
		for(int j=0;j<array2.length;j++) {
			array2[j]=object.nextInt();
		}
		method(array1,array2,n);
	}
	
	public static int method(int[] array1, int[] array2,int n) { 
		//int array3[]=new int[n];
		boolean found=false;
		for(int z=0;z<n;z++) {
			if(array1[z]==array2[z]) {
				
				System.out.print(array1[z]+" ");
				found=true;
			}
				
		}
		if(!found) {
			System.out.print("-1");
		}
		return 0;
	}

}
/*Given a number N and 2 arrays A and B of sorted order of size N, print the common elements.If it is not found print -1.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
5
1 1 1 1 1
1 2 3 4 5
OUTPUT
1*/