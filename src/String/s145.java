package String;
import java.util.*;
public class s145 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
	    String s = object.nextLine();
	    char a[]=new char[s.length()];
	    for(int i=0;i<s.length();i++) {
	    	a[i]=s.charAt(i);
	    }
	    int sum=0;
	    for(int i=0;i<s.length();i++) {
	    	sum=sum+(char)a[i];
	    	
	    }
	    System.out.print(sum); 
	}

}
/*Given a string S convert each characters of the string into ASCII values and print the sum of the numbers.
Input Size : |s| <= 100000
Sample Testcase :
INPUT
guvi
OUTPUT
443*/