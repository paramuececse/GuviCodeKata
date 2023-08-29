package ZenPack;
import java.util.*;
public class Zen25 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		
		        String input = "guvi geek";
		        String reversed = reverseString(input);
		        System.out.println(reversed);
		    }

		    public static String reverseString(String input) {
		        StringBuilder sb = new StringBuilder(input);
		        return sb.reverse().toString();
		    }
		}



/*Given a string reverse the string

Input Description:
Given a string

Output Description:
Print string into reverse

Sample Input :
guvi geek
Sample Output :
geek guvi*/