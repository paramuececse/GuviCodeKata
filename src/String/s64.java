package String;
import java.util.*;
public class s64 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		int k=object.nextInt();
		for(int i=0;i<s.length();i++) {
			if(i%k!=0) {
				int a=s.charAt(i)-32;
				System.out.print((char)a);
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
/*Given a string and a number K, change every kth character to uppercase from beginning in string.
Sample Testcase :
INPUT
string 2
OUTPUT
sTrInG*/