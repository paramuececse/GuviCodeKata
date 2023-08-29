package arrayPackage;
import java.util.*;
public class A148 {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array=new int[N];
		
		
		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		int j;
		for(j=0;j<array.length-1;j++) {
			System.out.print(array[j]+" ");
		}
		System.out.print(array[j]);
		
//		Arrays.sort(array);
//		int i;
//		for(i=array.length-1;i>0;i--) {
//			System.out.print(array[i]+" ");
//		}
//		System.out.print(array[i]);

	}

}
/*Given a number N and an array of N elements,sort the array in increasing order and print the original indices of the elements present in sorted array.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
5 4 3 2 1
OUTPUT
5 4 3 2 1*/