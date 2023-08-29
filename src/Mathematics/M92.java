package Mathematics;
import java.util.*;
public class M92 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		
		int remainder;
		int quotient=0;
		
		if(n==1) {
			System.out.println(1);
		}
		else {
		int[] array=new int[n];
        for(int i=1;i<=n;i++) {
        	//int a=0;
        	remainder=n%2;
        	//System.out.println(remainder);
        	array[i]=remainder;
        	if(array[i]==1) {
        		System.out.println(i);
        		break;
        	}
        	n=n/2;
        	//a++;
        }
	}
	}
}
/*Print the position of first 1 from right to left, in binary representation of an Integer.
Sample Testcase :
INPUT
18
OUTPUT
2*/