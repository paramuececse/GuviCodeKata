package String;
import java.util.*;
public class s21 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String palinstring=object.nextLine();
		
//		char[] a=new char[palinstring.length()];
//		for(int i=0;i<palinstring.length();i++) {
//			a[i]=palinstring.charAt(i);
//				
//		} 
		   if(method(palinstring)=="yes") {
			   System.out.println("yes");
		   }else {
			   System.out.println("no");
		   }
	}

	public static String method(String s) {
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				return "yes";
			}
		}
		return "no";
		
	}
	}

/*Given a string S, print 'yes' if it is a palindrome or 'no' if it is not a palindrome.
Sample Testcase :
INPUT
lappal
OUTPUT
yes*/