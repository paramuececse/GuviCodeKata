package Mathematics;
import java.util.Scanner;
public class M103 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		int c=object.nextInt();
		if(a*a+b*b ==c*c) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
/*Given 3 numbers A,B,C print 'yes' if they can form the sides of a right angled triangle,otherwise 'no'.
Input Size : A,B,C <= 100000
Sample Testcase :
INPUT
3 4 5
OUTPUT
yes*/