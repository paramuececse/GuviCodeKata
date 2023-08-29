package String;
import java.util.*;
public class s27 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) 
				if(s.charAt(i)!=s.charAt(j)){
					System.out.print(s.charAt(i));
					break;
					}
		}

	}

}
/*You are given a string ‘S’ consisting of lowercase Latin Letters. Find the first non repeating character in S. If you find all the characters are repeating print the answer as -1

Input Description:
You are given a string ‘s’

Output Description:
Print the first non occurring character if possible else -1.

Sample Input :
apple
Sample Output :
a*/