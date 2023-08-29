package Mathematics;
import java.lang.Math;
import java.util.Scanner;

public class M129 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		if(N%2==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
/*Given a number N, check whether it is a power of 2.
Sample Testcase :
INPUT
2048
OUTPUT
yes*/