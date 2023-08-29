package Mathematics;
import java.util.*;
public class M70 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int fact=1;
		for(int i=1;i<N;i++) {
			if(N%i==0 &&i%2!=0) {
			//fact=fact*;
			System.out.print(i);
			}
			
		}
		if(N%2!=0)
		System.out.print(N);
		
	}

}
/*Given a number N, print the odd factors for the N.
Input Size : 1 <= N <= 1000
Sample Testcase :
INPUT
9
OUTPUT
1 3 9*/