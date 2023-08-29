package String;
import java.util.*;
import java.math.BigInteger;
public class s131 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String  s1=object.next();
		String s2=object.next();
		BigInteger a=new BigInteger(s1);
		BigInteger b=new BigInteger(s2);
		BigInteger	 result=a.multiply(b);
		System.out.println(result);
	}
}
/*Given two numbers S1 and S2 represented as strings, return multiplication of the numbers as a string.
NOTE: The numbers can be arbitrarily large and are nonnegative.
Sample Testcase :
INPUT
2 10
OUTPUT
20*/