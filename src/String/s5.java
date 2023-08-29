package String;
import java.util.*;
public class s5 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		char[] a=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=s.charAt(i);
		}
		System.out.println(method(s,a));
		if(method(s,a)==1) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
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
/*you are given a string made up of parenthesis only.Your task is to check whether parenthesis are balanced or not.If they are balanced print 1 else print 0

Input Description:
You are given a string ‘s’

Output Description:
Print 1 for balanced and 0 for imbalanced

Sample Input :
{({})}
Sample Output :
1*/