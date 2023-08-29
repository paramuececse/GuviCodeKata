package Basic;
import java.util.*;
public class b18 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int A=object.nextInt();
		int B=object.nextInt();	
		int C=object.nextInt();	
	    if(A*A+B*B==C*C ) {
	    	System.out.println("yes");
	    }
	    else {
	    	System.out.println("no");
	    }
	}

}
/*Given 3 numbers A,B,C process and print 'yes' if they can form the sides of a triangle otherwise print 'no'.
Input Size : A,B,C <= 100000
Sample Testcase :
INPUT
3 4 5
OUTPUT
yes*/