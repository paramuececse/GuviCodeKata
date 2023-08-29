package String;
import java.util.*;
public class s48 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
			System.out.print(s.charAt(i)); //;
			}			
		}
	}
	}


/*Given a string/sentence remove all the spaces and print the result.
Input Size : |s| <= 1000000(complexity O(n))
Sample Testcase :
INPUT
guvi geeks
OUTPUT
guvigeeks*/