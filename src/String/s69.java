package String;
import java.util.*;
public class s69 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				int a=s.charAt(i)-32;
				System.out.print((char)a);
			}
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
				int b=s.charAt(i)+32;
			
				System.out.print((char)b);
			}
			else {
				System.out.print(' ');
			}

	}
	}
}
/*Given a string S of length N, reverse the case of each letter.
Input Size : N <= 100
Sample Testcase :
INPUT
HeLlo
OUTPUT
hElLO*/