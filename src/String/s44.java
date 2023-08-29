package String;
import java.util.*;
public class s44 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i)); //;
					
		}
	}

}
/*Given a string S, print the reverse of the string.
Input Size : |s| <= 100000 (ie do it in O(n) or O(log n) time complexity)
Sample Testcase :
INPUT
codekata
OUTPUT
atakedoc*/