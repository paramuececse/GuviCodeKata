package arrayPackage;
import java.util.*;
public class A69 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		for(int j=0;j<s.length();j++) {
			if(c[j]>=65&&c[j]<=90|| c[j]>=97&&c[j]<=122) {
				int variable=c[j]+3;
				System.out.print((char)variable);
			}
		}
	}

}
/*Given a string S, print the encoded string by adding 3 to each character(a maps to d,b maps to e,c maps to f and so on).
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
RADAR
OUTPUT
UDGDU*/