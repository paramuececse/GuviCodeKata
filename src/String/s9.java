package String;
import java.util.*;
public class s9 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		String a="";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				count++;
				if(count>2)
					 a = "-1";
			}
			
		}
		String b=(count==3)?"Wonder":a;
		System.out.println(b);
         
	}
}
/* You are given a string. You have to print “Wonder” if the string is wonderful and -1 if it is not. A wonderful string is a string,which is made up of exactly 3 different characters.

Input Description:
You are given a string

Output Description:
Print “Wonder” if it is wonderful and -1 if it is not

Sample Input :
aabbcc
Sample Output :
Wonder*/