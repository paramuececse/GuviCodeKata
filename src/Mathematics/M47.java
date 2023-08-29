package Mathematics;
import java.util.*;
public class M47 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int sum=0;
		while(n>0) {
			int remainder=n%10;
			sum=sum*10+remainder;
			n=n/10;
		}
		System.out.print(sum);

	}

}
/*Given a number N, print its reverse.
Input Size : n <= 1000
Sample Testcase :
INPUT
10
OUTPUT
1*/