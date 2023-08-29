package Mathematics;
import java.util.*;
public class M123 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();	
        for(int i=2;i<N/2;i++) {
        	if(N%i!=0 ) {
        		System.out.println(i);
        	}
        }
	}

}
/*Given a number N, print their prime factors in sorted order.
Input Size : 2 <= N <= 100000
Sample Testcase :
INPUT
18
OUTPUT
2 3*/