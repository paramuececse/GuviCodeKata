package Mathematics;
import java.util.Scanner;
public class M42 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		int x=object.nextInt();
        int y=(a*x)+b;
        System.out.println(y);
	}

}
/*Given the values of a,b and x in the equation ax + b = y. Find the value of y.
Sample Testcase :
INPUT
3 5 2
OUTPUT
11*/