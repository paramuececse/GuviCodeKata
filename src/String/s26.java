package String;
import java.util.*;
public class s26 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' ) {
				int a=s.charAt(i);
				System.out.print((char)a+65);
			}
			else if (s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
				int a=s.charAt(i);
				System.out.print((char)a-65);
			}
			else {
				System.out.print(' ');
			}
		}

	}

}
/*You are given a string ‘s’.Your task is to print the string in alternate lowercase and uppercase order.

Input Description:
You are given a string

Output Description:
Print the string according to given criteria

Sample Input :
abcd efgh ijkl
Sample Output :
ABCD efgh IJKL*/