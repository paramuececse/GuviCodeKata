package Basic;
import java.util.*;
public class b34 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=object.nextInt();
		}
		int sum=0;
		for(int j=0;j<N-1;j++) {
			sum=arr[j]&arr[j+1];
		}
		System.out.println(sum);
	}

}
/*Given a number N and an array of N elements ,find the Bitwise AND of the array elements.
Input Size N <= 100000
Sample Testcase :
INPUT
4
4 3 2 1
OUTPUT
0*/