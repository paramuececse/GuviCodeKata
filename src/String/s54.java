package String;
import java.util.*;
public class s54 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		for(int i=0;i<s.length();i++) {
			if(i==0||i==2)
			System.out.print(s.charAt(i)); 
					
		}

	}

}
/*Given a string S, print the 1st and 3rd character of the string (chracter index starts from 1).
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
codekata
OUTPUT
cd*/