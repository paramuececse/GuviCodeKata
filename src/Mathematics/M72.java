package Mathematics;
import java.util.*;
public class M72 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		
		int[] array=new int[s.length()];
		for(int i=s.length()-1;i>=0;i--) {
			array[i]=Character.getNumericValue(s.charAt(i));
		}
		int sum=0,length=s.length();
		for(int j=0;j<s.length();j++) {
			length--;
			if(array[j]==1) {
			sum=(int) (sum+(Math.pow(2, length)));	
			}
		}
		System.out.println(sum);
         
         
	}

}
/*Given a number N in binary format convert it to decimal number.
Input Size : N <= 100000
Sample Testcase :
INPUT
101
OUTPUT
5*/