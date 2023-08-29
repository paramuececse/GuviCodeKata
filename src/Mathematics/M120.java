package Mathematics;
import java.util.*;
public class M120 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		for(int i=2;i<N;i++) {
			if(N%i==0) {
				System.out.println("yes");
				break;
			}
		}

	}

}
/*Given a number N, check if N is divisible by any number less than N (ie.,it leaves no remainder)except 1.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
10
OUTPUT
yes*/