package Mathematics;
import java.util.*;
import java.lang.Math;
public class M127 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();	
		int i=1;
		for(i=1;i<=N;i++) {
			int a=(int) Math.pow(2, i);
			if( a<N && N%a==0) {
				System.out.print(a+" ");
			}
			else if(a==N){
				System.out.print(a);
			}
			
			
		}
		

	}

}
/*Given a number N, print the even factors of N.If the even factor does not exists for N print '-1'.
Input Size : 1 <= N <= 1000
Sample Testcase :
INPUT
8
OUTPUT
2 4 8*/