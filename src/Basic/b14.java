package Basic;
import java.util.*;
public class b14 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=object.nextInt();	
			}
		int sum=0;
		for(int j=0;j<N;j++) {
			sum=sum | arr[j];
		}
System.out.println(sum);
	}

}
/*Given a number N and an array of N elements, find the Bitwise OR of the array elements.
Input Size : N <= 100000
Sample Testcase :
INPUT
2
2 4
OUTPUT
6*/
