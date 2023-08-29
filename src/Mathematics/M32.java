package Mathematics;
import java.util.Scanner;
public class M32 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
        if(n%13==0) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
	}

}
/*Given a number N, print 'yes' if it is a multiple of 13 else print 'no'.
Sample Testcase :
INPUT
26
OUTPUT
yes*/