package Mathematics;
import java.util.Scanner;
public class M9 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		int c=object.nextInt();
		int mod=(a*b)%c;
		System.out.println(mod);

	}

}
/*Given 3 numbers a,b,c print a*b mod c.
Sample Testcase :
INPUT
5 3 2
OUTPUT
1*/