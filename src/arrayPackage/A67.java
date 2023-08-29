package arrayPackage;
import java.util.*;
public class A67 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s1=object.next();
		String s2 = s1;
		if(s1.equals(s2)) {
			System.out.println(s1);
		}

	}

}
/*Given a sentence S take out the extra spaces.If no extra space is present print the same as output.
Input Size : |s| <= 100000(complexity O(n))
Sample Testcase :
INPUT
codekata challenge
OUTPUT
codekata challenge*/