package Mathematics;
import java.util.Scanner;
public class M30 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int count=0;
		int remainder=0;
		while(n>0) {
			remainder=n%10;
			count++;
			n=n/10;
		}
System.out.println(count);
	}

}
/*Count the number of digits of a given number N.Size of the integer ranges from 1Sample Testcases :
INPUT
548
OUTPUT
3*/