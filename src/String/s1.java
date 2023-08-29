package String;
import java.util.*;
public class s1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String name=object.nextLine();
		int i,a=0;
		int length=name.length();
		for( i=name.length()-1;i>=0;i--) {
			if(i==length-1) {
			  a = name.charAt(i)-32;
			System.out.print((char)a);
			}
			else {
				System.out.print(name.charAt(i));
			}
				
		}
		//System.out.print((char)name.charAt(i)-32);

	}

}
/* Jennyfer is fond of strings. She wants to read the character from right to left (reverse the string), so she wants you to design a suitable algorithm which satisfy her desire.

Input Description:
Enter the string ‘s’

Output Description:
Print the string from characters right to left.

Sample Input :
jennyfer
Sample Output :
Refynnej*/