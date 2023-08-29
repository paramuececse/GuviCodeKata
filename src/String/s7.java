package String;
import java.util.*;
public class s7 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		char[] a=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=s.charAt(i);
		}
		System.out.println(method(s,a));
//		if(method(s,a)==1) {
//			//System.out.print(1);
//		}
//		else {
//			//System.out.print(0);
//		}
	}

	private static int method(String s,char a[]) {
		for(int i=0;i<s.length();i++) {
			if(a[i]==a[s.length()-i-1]) {
				
				return 1;
			}
				
			
		}
		return 0;
	}

}
/* Radha newly learnt about palindromic strings.A palindromic string is a string which is same when read from left to right and also from right to left.Help her in implementing the logic.

 

Input Description:
You are given a String ‘s’

Output Description:
Print 1 if String is palindrome or 0 if not

Sample Input :
NITIN
Sample Output :
1*/