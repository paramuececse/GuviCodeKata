package arrayPackage;
import java.util.*;
public class A71 {

	public static void main(String[] args) {

		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array =new int [N];

		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		int sum=0;
		for(int j=0;j<array.length;j++) {
			if(array[j]<=0) {
				sum=sum+array[j];
			}
		}
		System.out.println(sum);
	}

}
/*Given a number N and an array of N integers, find the sum of all the negative numbers in the array.
Input Size : N <= 100000
Sample Testcase :
INPUT
2
3 0
OUTPUT
0*/