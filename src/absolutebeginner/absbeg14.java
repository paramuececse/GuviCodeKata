package absolutebeginner;
import java.util.Scanner;
public class absbeg14 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!= ' ') {
			//System.out.print(s.charAt(i));
			count++;
		}
		}
	System.out.println(count);
}
}
/*   
let "A"  be a string. Remove all the whitespaces and find it's length.

Input Description:
A string is provide as an input

Output Description:
Remove all the whitespaces and then print the length of the remaining string.

Sample Input :
Lorem Ipsum
Sample Output :
10
*/
