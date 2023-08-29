package arrayPackage;
import java.util.*;
public class A154 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array =new int [N];

		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		int sum=0,j;
		for(j=0;j<array.length-1;j++) {
			 sum=sum+array[j];
			 System.out.print(sum+" ");
		}
         System.out.print(sum+array[j]);
	}

}
/*Given a number N and an array of N elements, print the prefix sum array.
Input Size : N <= 100000
Sample Testcase :
INPUT
4
2 4 4 2
OUTPUT
2 6 10 12*/