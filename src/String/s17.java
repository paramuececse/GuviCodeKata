package String;
import java.util.*;
public class s17 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.nextLine();
	char a[] =new char[s.length()];
	for(int i=0;i<s.length();i++) {
		a[i]=s.charAt(i);
	}
	for(int i=0;i<s.length();i++) {
		if(i%2==0) {
			System.out.print(a[i]);
		}
	}
		System.out.print(" ");
		for(int j=0;j<s.length();j++) {
			if(j%2!=0) {
				System.out.print(a[j]);
			}
	}
	
	

	}}
/*Given a string S, print 2 strings such that first string containing all characters in odd position(s) and other containing all characters in even position(s).
Sample Testcase :
INPUT
XCODE
OUTPUT
XOE CD*/