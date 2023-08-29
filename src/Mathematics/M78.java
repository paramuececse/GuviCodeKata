package Mathematics;
import java.util.*;
public class M78 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		int x=1,y=1;
		for(int i=1;i<=a;i++) {
			x=x*i;
		}
		for(int j=1;j<=b;j++) {
			y=y*j;
		}
          System.out.println(x/y);
	}

}
/*Given 2 numbers a and B.Print the value of a!/b!.
Input Size : A,B <= 10000 and A-B <= 5
Sample Testcase :
INPUT
4 2
OUTPUT
12*/