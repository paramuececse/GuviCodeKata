package String;
import java.util.*;
public class s24 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String palinstring=object.nextLine();
		int count=0;
		char[] a=new char[palinstring.length()];
		for(int i=0;i<palinstring.length();i++) {
			a[i]=palinstring.charAt(i);
			count++;
					
		} 
System.out.println(count);
	}

}
/*Given a string S, find its length(including the spaces)without using any pre-defined functions.
Sample Testcase :
INPUT
codekata
OUTPUT
8*/