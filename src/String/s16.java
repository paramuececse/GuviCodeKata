package String;
import java.util.*;
public class s16 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.nextLine();
	char[] a=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		a[i]=s.charAt(i);
	}
	for(int i=0;i<s.length();i++) {
		if(a[i]!='a'&&a[i]!='e'&& 
		a[i]!='i'&& a[i]!='o'&& a[i]!='u' && a[i]!='A'&&a[i]!='E'&& 
		a[i]!='I'&& a[i]!='O'&& a[i]!='U') {
			System.out.print(a[i]);
			
		}
	}

	}

}
/*You are given a string.Your task is to print only the consonants present in the string without affecting the sentence spacings if present. If no consonants are present print -1

Input Description:
You are given a string ‘s’.

Output Description:
Print only consonants.

Sample Input :
I am shrey 
Sample Output :
 m shry*/