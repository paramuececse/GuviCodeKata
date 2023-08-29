package ZenPack;
import java.util.*;
public class Zen32 {
			public static void main(String[] args) {
				Scanner object=new Scanner(System.in);
				String s=object.nextLine();
				char[] array=new char[s.length()];
		        for(int i=0;i<s.length();i++) {
		        	array[i]=s.charAt(i);
		        }
		        for(int i=0;i<s.length();i++) {
		        	if(array[i]!='a' &&array[i]!='e'&&array[i]!='i' &&array[i]!='o' &&array[i]!='u'  ) {
		        		System.out.print(array[i]);
		        	}
			}
	}
}

/*Given a string remove the vowels in the string

Input Description:
Given a string

Output Description:
Print the string

Sample Input :
guvi geek
Sample Output :
gv gk*/