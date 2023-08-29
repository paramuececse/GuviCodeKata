package arrayPackage;
import java.util.*;
public class A171 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array =new int [N];

		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		Arrays.sort(array);
		for(int j=array.length-1;j>=0;j--) {
			System.out.print(array[j]);
		}
	}

}
/*Given a number N followed by N numbers. Find the largest number which can be formed from the given numbers and print it.
NOTE: Each number should be used exactly once.
Input Size : 1 <= N <= 100000
Sample Testcases :
INPUT
5
5 6 7 8 9
OUTPUT
98765*/