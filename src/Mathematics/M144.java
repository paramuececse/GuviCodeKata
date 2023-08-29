package Mathematics;
import java.util.*;
public class M144 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		
		int sum=0;
		int sum1=0;
		while(a>0) {
			int remainder=a%10;
			 sum=sum+remainder;
			 a=a/10;
		}
		//System.out.println(sum);
		while(sum>0) {
			int remainder1=sum%10;
			 sum1=sum1*10+remainder1;
			 sum=sum/10;
		}
		//System.out.println(sum1);
           if(sum!=sum1) {                                 // memory allocation wrong.
    	System.out.println("yes");
                     }
   
        else {
    	System.out.println("no");
    }
	}

}
/*Given a number N, check if the sum of the digits is a Palindrome. Print 'yes' or 'no' accordingly.
Input Size : 2 <= N <= 1000000000000000000
Sample Testcases :
INPUT
13
OUTPUT
yes*/