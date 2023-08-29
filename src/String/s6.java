package String;
import java.util.*;
public class s6 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		int[] array=new int[s.length()];
		
		String a="no";
		for(int i=0;i<s.length();i++) {
			array[i]=s.charAt(i);
		}
		for(int j=0;j<s.length();j++) {
			if(array[j]=='a'||array[j]=='e'||array[j]=='i'||array[j]=='o'||array[j]=='u') {
				a="yes";
				//System.out.println(a);
				break;
			}
			
		}
		System.out.println(a);

	}

}
//https://docs.google.com/document/d/1UU378VUiQJJL1KuMyDnq_WAwx6A7xs0XMGHVxe0qJXI/edit?usp=sharing
/*Given a string S, print 'yes' if it has a vowel in it else print 'no'.
Sample Testcase :
INPUT
codekata
OUTPUT
yes*/