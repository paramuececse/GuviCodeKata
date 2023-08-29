package Mathematics;
import java.util.*;
public class M20 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int remainder=0,sum=1;
		while(n>0) {
			remainder=n%10;
			sum=sum*remainder;
			n=n/10;
		}
System.out.println(sum);
	}

}
/*Given a number N, print the product of the digits.
Input Size : N <= 100000000000
Sample Testcase :
INPUT
2143
OUTPUT
24*/