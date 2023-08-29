package Gcodekata;
import java.io.*;
import java.util.Scanner;
public class IoFormat9 {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);	
String s=sc.next();
for(int i=0;i<s.length();i++) {
	System.out.println(s.charAt(i));
}
}
}
/*Write a code to get the input in the given format and print the output in the given format.

Input Description:
A single line contains a string.

Output Description:
Print the characters in a string separated by line.

Sample Input :
guvigeek
Sample Output :
g
u
v
i
g
e
e
k*/