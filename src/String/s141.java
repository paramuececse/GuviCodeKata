package String;
import java.util.*;
public class s141 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
	    String s = object.nextLine();
	    int k=object.nextInt();
	    for(int i=0;i<s.length();i++) {
	    	if(i%2==0) {
	    		System.out.print(s.charAt(i)+" ");
	    	}
	    	else {
	    		System.out.print(s.charAt(i));
	    	}
	    }

	}

}
/*Given a string S and a number K. Print all the substrings of S of length K(space separeted output).
Input Size : |S| <= 100 and K<= 50
Sample Testcase :
INPUT
prog 2
OUTPUT
pr ro og*/