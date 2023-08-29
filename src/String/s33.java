package String;
import java.util.*;
public class s33 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		int count=0;
		char[] a=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=s.charAt(i);
			count++;
					
		} 
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(a[i]>='A'&& a[i]<='Z' && count<=10 || a[i]>='1'&&a[i]<='5') {
				sb.append(a[i]);
				
			}
		
		}
if(s.contains(sb)) {
	System.out.println("pan");
}
else {
	System.out.println("no pan");
}
	}

	

}
/*Indian PAN card issuing authority have found some fake PAN cards. They have hired you so that you can validate PAN card for them. Your task is to develop a suitable algorithm which could check if pan is valid or not

1)Pan must have uppercase letters only.

2)It must be of 10 character only

3)From index 1 to 5 all must be letters(A-Z),last index must be letter

4)Rest all must be integer Starting from 1

Input Description:
You are given a input string which indicates the PAN number

Output Description:
Print 'pan' if it is valid PAN number, else print 'not pan'

Sample Input :
HXTPS2142R
Sample Output :
pan*/