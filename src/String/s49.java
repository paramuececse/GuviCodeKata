package String;
import java.util.*;
public class s49 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		for(int i=s.length()-1;i>0;i--) {
			System.out.print(s.charAt(i)+"-"); //;
					
		}
		System.out.print(s.charAt(0));
	}

	}


/*Given a input string S, reverse the given string by appending each character of the string with '-'.
Input Size : |S| <= 100000
Sample Testcase :
INPUT
codekata
OUTPUT
a-t-a-k-e-d-o-c*/