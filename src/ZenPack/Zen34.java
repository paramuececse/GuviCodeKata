package ZenPack;
import java.util.Scanner;
public class Zen34 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char[] array=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	array[i]=s.charAt(i);
        }
       
        System.out.println( method(s,array));
	}
        public static int method(String str, char[] array) {
        	for(int i=0;i<str.length();i++) {
            	if(Character.isAlphabetic(i)||!Character.isAlphabetic(i)) {
            		System.out.print(array[i]);
            	}
            	else {
            		return -1;
            	}
        	}
			
           return 0; 
    		
    	}
}
/*Given a string remove special characters if there is no special characters print -1

Input Description:
Given a string

Output Description:
Print the string or -1

Sample Input :
Xyz-aBc-nMk
Sample Output :
XyzaBcnMk*/