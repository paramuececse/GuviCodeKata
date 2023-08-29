package String;
import java.util.*;
public class s10 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		int sum=0,a=0;
        for(int i=0;i<s.length();i++) {
        	if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
        		 a=(int)c[i];
        		sum=sum+a;
        		//System.out.print(a);
        	}
        }
        if(a%8==0) {
        	System.out.print(1);
        }
        else {
        	System.out.print(0);
        }
	}

}
/* You are given a ‘true’ string. String is called true if weight of string is multiple of 8. Your task is to tell whether a string can be declared True or Not. Weight of string is the sum of ASCII value of Vowel character(s) present in the string.

Input Description:
You are given as string ‘s’ in lower cases

Output Description:
Print 1 for true and 0 for false

Sample Input :
raja
Sample Output :
0*/