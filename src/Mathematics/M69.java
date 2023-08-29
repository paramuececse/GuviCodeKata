package Mathematics;
import java.util.*;
public class M69 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		int a=1;
		int count=0;
		for(int i=N;i>=1;i--) {
			a =a*i;
			count++;
			if(count==K)
				break;
		}
		//System.out.println(a);
		int b=1;
		for(int j=K;j>=1;j--) {
			b=b*j;
		}
		//System.out.println(b);
          System.out.println(a/b);
	}

}
/*Given 2 numbers N,K print the value of nCk(C-Combination).
Input Size : K <= N <= 10
Sample Testcase :
INPUT
5 2
OUTPUT
10*/