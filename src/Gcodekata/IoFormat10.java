package Gcodekata;
import java.util.Scanner;
public class IoFormat10 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.next();
	int i;
	for(i=0;i<s.length()-1;i++) {
		System.out.print(s.charAt(i)+",");
	}
	System.out.print(s.charAt(i));
}
}
/*Write a code to get the input in the given format and print the output in the given format.

Input Description:
A single line contains a string.

Output Description:
Print the characters in a string separated by comma.

Sample Input :
guvi
Sample Output :
g,u,v,i*/