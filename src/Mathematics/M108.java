package Mathematics;
import java.util.Scanner;
public class M108 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		if(n<=100000) {                       //6 digits -->integer
			System.out.println("INT");
		}else {
			System.out.println("LONG");
		}

	}

}
/*Given a number N, print 'INT' if it is integer range or print 'LONG' if it is greater.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
999
OUTPUT
INT*/