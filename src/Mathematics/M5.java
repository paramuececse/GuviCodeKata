package Mathematics;
import java.util.Scanner;
public class M5 {

	public static void main(String[] args) {
		Scanner object =new Scanner(System.in);
		int n=object.nextInt();
	    
	    if( n%7==0) {
	    	System.out.println("yes");
	    }
	    else {
	    	System.out.println("no");
	    }
	}

}
/*Given a number N, print yes if the number is a multiple of 7 else print no.
Sample Testcase :
INPUT
49
OUTPUT
yes*/