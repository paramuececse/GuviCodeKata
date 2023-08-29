package Mathematics;
import java.util.Scanner;
public class M107 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		int c=object.nextInt();
		int add=a+b+c;
		if(add<=180) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
/*Given 3 angles A,B,C find if they can be interior angles of a triangle.If they form an interior triangle for the given angle,print 'yes' otherwise print 'no'.
Input Size : 0 <= A,B,C <= 180
Sample Testcase :
INPUT
2 2 176
OUTPUT
yes*/