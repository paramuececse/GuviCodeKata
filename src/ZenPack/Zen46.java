package ZenPack;
import java.util.*;
public class Zen46 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char[] array=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	array[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++) {
        	if(array[i]=='a' ||array[i]=='e' ||array[i]=='i' ||array[i]=='o' ||array[i]=='u'  ) {
        		int a=array[i]-32;
        		//System.out.println(a);
        		System.out.print((char)a);
        	}
        	else {
        		System.out.print(array[i]);
        	}
        }
	}

}
/*Given a string convert string into upper case where their vowel character

Input Description:
Given a string

Output Description:
Print string into upper case

Sample Input :
guvi geek
Sample Output :
gUvI gEEk*/