package String;
import java.util.*;
public class s15 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum=sum+s.charAt(i);
		}
System.out.println(sum);
	}

}
/*Given a string 'S' print the sum of weight of the String. A weight of character is defined as the ASCII value of corresponding character.

Input Description:
You are given a string ‘s’

Output Description:
Print weight

Sample Input :
abc
Sample Output :
294*/