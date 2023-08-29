package Mathematics;
import java.util.*;
public class M79 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
System.out.println(fact);
	}

}
/*Given a number N, find the factorial of N.
Input Size : 1 <= N <= 25
Sample Testcase :
INPUT
5
OUTPUT
120*/