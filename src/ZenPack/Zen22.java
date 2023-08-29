package ZenPack;
import java.util.*;
public class Zen22 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char[] a=new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
		 a[i]=s.charAt(i);
		}
		int count=0,count1=0;
		for(int i=0;i<s.length();i++) {
			if(a[i]>='a' && a[i]<='z'&& a[i]!=' ') {
		   count++;
		}
		else if(a[i]>='A' && a[i]<='Z' && a[i]!=' '){
			count1++;
		}
	}
		System.out.print(count1+" ");
		System.out.print(count);
}
}

/* Given a string find the number of uppercase letters and lowercase letters

Input Description:
Given a string

Output Description:
Print the number of uppercase and lowercase

Sample Input :
Guvi Geek
Sample Output :
2 6*/