package Mathematics;
import java.util.Scanner;
public class M18 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		int diff=a-b;
		if(diff%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
/*Given 2 numbers N,M. Find their difference and check whether it is even or odd.
Sample Testcase :
INPUT
5 5
OUTPUT
even*/