package Mathematics;
import java.util.Scanner;
public class m105 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
        int n=object.nextInt();
        int remainder=0,sum=0;
        while(n>0) {
        	remainder=n%10;
        	sum=sum+remainder*remainder;
        	n=n/10;
        }
        System.out.println(sum);
	}

}
/*Given a number N, print the sum of the squares of its digits.
Input Size : 1 <= N <= 1000000000000000000
Sample Testcase :
INPUT
19
OUTPUT
82*/