package arrayPackage;
import java.util.*;
public class a225 {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		int mul=1;
		for(int i=0;i<n;i++) {
			mul=mul*array[i];
		}
		System.out.println(mul);
	}
}
/*Given a number N and an array of size N(with both positive and negative integers), print the product of the elements in the maximum product subarray.
Input Size : 1 <= N <= 100000
Sample Testcases :
INPUT
5
1 2 3 4 5
OUTPUT
120*/