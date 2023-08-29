package ZenPack;

import java.util.Scanner;

public class Zen35 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char[] array=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	array[i]=s.charAt(i);
        }
        int count=0;
        for(int i=0;i<s.length();i++) {
        	if(array[i]!=' ') {
        		count++;
        	}
        }
        System.out.println(count);

	}

}
/*Given a string find the length of the string without space

Input Description:
Given a string

Output Description:
Print length in number

Sample Input :
guvi geek
Sample Output :
8*/