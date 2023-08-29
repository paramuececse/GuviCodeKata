package String;
import java.util.*;
public class s12 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
        String s=object.nextLine();
        char[] a=new char[s.length()];
        int T =object.nextInt();
        int P=object.nextInt();
        for(int i=0;i<s.length();i++) {
        	a[i]=s.charAt(i);
        }
        int j;
        if(T==1)
        for( j=0;j<s.length();j++) {
        	if(j%2!=0)
        	if(a[j]>='a'&&a[j]<='z') {
     	      System.out.print(a[j]); 
        }
	}
        }
}

/*Write a program to get a string S, Type of conversion (1 - Convert to Lowercase, 2 - Convert to Uppercase) T, and integer P . Convert the case of the letters in the positions which are multiples of P.(1 based indexing).

Input Description:
Given a string S, Type of conversion T, and integer P

Output Description:
Convert the case of the letters and print the string

Sample Input :
ProFiLe
1
2
Sample Output :
Profile*/