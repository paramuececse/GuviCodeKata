package Mathematics;
import java.util.*;
public class M113 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[][] array=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				array[i][j]=object.nextInt();
			}
		}
		int sum=1,sum1=1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==j) {
					sum=sum*array[i][j];
				}
				else {
					sum1=sum1*array[i][j];
				}
			}
		}
System.out.println(sum+sum1);
	}

}
/*Given a square matrix of size N x N, find the sum of the product of its diagonals.
Input Size : N <= 1000
Sample Testcase :
INPUT
2
2 4
3 7
OUTPUT
26*/