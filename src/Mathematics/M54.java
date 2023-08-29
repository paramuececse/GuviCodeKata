package Mathematics;
import java.util.*;

public class M54 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int sum=0;
         while(n>0) {
        	 int remainder=n%10;
        	 sum=sum+remainder*remainder;
        	 n=n/10;
         }
         System.out.println(sum);
	}

}
/*Given a number N, print the sum of squares of all its digits.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
12
OUTPUT
5*/