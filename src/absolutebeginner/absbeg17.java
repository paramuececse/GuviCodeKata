package absolutebeginner;
import java.util.Scanner;
public class absbeg17 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.nextLine();
	int i;
	for(i=0;i<s.length()-1;i++) {
		System.out.print(s.charAt(i)+ " ");
	}
	System.out.println(s.charAt(i));
	//System.out.println(s.length());
	}
}
/*   
Write a code to get an integer N and print the digits of the integer.

Input Description:
A single line contains an integer N.

Output Description:
Print the digits of the integer in a single line separated by space,

Sample Input :
348
Sample Output :
3 4 8
*/