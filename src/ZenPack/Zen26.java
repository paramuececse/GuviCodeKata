package ZenPack;
import java.util.Scanner;
public class Zen26 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char[] array=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	array[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++) {
        	if(array[i]=='a' ||array[i]=='e' ||array[i]=='i' ||array[i]=='o' ||array[i]=='u'  ||array[i]==' ') {
        		
        		System.out.print(array[i]);
        	}

	}

	}}
/*Given a string print the vowels in the string

Input Description:
Given a string

Output Description:
Print the String

Sample Input :
guvi geek
Sample Output :
ui ee*/