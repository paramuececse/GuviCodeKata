package String;
import java.util.*;
public class s107 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String  s=object.next();
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++) {
        	a[i]=Character.getNumericValue(s.charAt(i));
        }
       int sum=a[0]+a[s.length()-1];
       System.out.println(sum);

	}

}
/*Given a number N, print the sum of its first and last digit.
Input Size : |N| <= 10000
Sample Testcase :
INPUT
51233
OUTPUT
8*/