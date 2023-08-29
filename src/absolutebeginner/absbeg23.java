package absolutebeginner;
import java.util.Scanner;
public class absbeg23 {
	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s =object.next();
	//System.out.println(s.length());
	int i;
	for(i=s.length()-1;i>=0;--i) {
		
		System.out.print(s.charAt(i));
	}
	
}
}
/*   
Write a program to get a string as input and reverse the string without using temporary variable.

Input Description:
A single line containing a string.

Output Description:
Print the reversed string.

Sample Input :
GUVI
Sample Output :
IVUG
*/