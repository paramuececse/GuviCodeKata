package Mathematics;
import java.util.*;
public class M35 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
        int n=object.nextInt();
       
        
        for(int i=1;i<=n;i++) {
        	if(Math.pow(2, i)==n) {
        		System.out.println((int)Math.pow(2, i+1));
        		break;
        	}
        }
	}

}
/*Given a number N, find its next immediate greater power of 2(i.e 2^1, 2^2, 2^3...).
Input Size : N <= 1000
Sample Testcase :
INPUT
4
OUTPUT
8*/