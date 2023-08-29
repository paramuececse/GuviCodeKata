package String;

import java.util.*;
public class s40 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		for(int j=0;j<s.length();j++) {
			if(c[j]=='X')
				System.out.print('A');
			else if(c[j]>=65||c[j]<=90|| c[j]>=97||c[j]<=122) {
				int variable=c[j]+3;
				System.out.print((char)variable);
			}
		}
	}

}