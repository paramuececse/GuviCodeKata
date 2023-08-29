package String;
import java.util.*;
public class s110 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
        int a=s.length();
        System.out.println(a);
	}

}
/*Given a string S. Find the maximum length of substring alternating characters of vowel and consonants.
Input Size : |S| <= 1000000
Sample Testcase :
INPUT
bebibo
OUTPUT
6*/