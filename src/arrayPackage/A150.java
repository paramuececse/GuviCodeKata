package arrayPackage;
import java.util.*;
public class A150 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array=new int[N];
		
		
		for(int i=0;i<N;i++) {
			array[i]=object.nextInt();
		}
		int[] result=presumdivtwo(N,array);
			
		for(int i=0;i<N;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	public static int[] presumdivtwo(int N, int[] array) {
		int[] emptyarr=new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			sum=sum+array[i];
			
			if(sum%2==0) {
				emptyarr[i]=array[i];
			}
			else {
				emptyarr[i]=sum;
			}
		}
		return emptyarr;
	}
}
/*Given a number N and array of N integers, print the prefix sum array for each position if it is divisible by 2 else print the element itself.
Input Size : N <= 10000
Sample Testcase :
INPUT
4
2 4 4 4
OUTPUT
2 6 10 14*/