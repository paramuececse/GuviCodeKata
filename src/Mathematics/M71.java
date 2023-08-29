package Mathematics;
import java.util.*;
public class M71 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		int fact1=N;
		for(int i=N-1;i>=1;i--) {
			fact1=fact1*i;
		}
		//System.out.println(fact1);
		int number=N-K;
		int fact2=1;
		for(int j=number;j>=1;j--) {
			fact2=fact2*j;
		}
		//System.out.println(fact2);
		System.out.println(fact1/fact2);

	}

}
/*Given 2 numbers N,K print the value of nPk(P-Permutation).
Input Size : K <= N <= 10
Sample Testcase :
INPUT
5 2
OUTPUT
20*/