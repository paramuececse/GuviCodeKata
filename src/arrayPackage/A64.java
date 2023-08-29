package arrayPackage;
import java.util.*;
public class A64 {
	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.next();
	char[] array=new char[s.length()];
	
		for(int i=0;i<s.length();i++) {
		array[i]=s.charAt(i);
		}
		
		System.out.println(method(s,array));
	
	}
	public static String method(String s,char[] array) {
	for(int j=s.length()-1;j>=0;j--) {
		
		if(array[j]!='a'&&array[j]!='e'&&array[j]!='i'&&array[j]!='o'&&array[j]!='u') {
			
		   System.out.print(array[j]);
		}
	}
	return "-1";
	}
	}
	

	
/*Given a string S, print the reverse of the string after removing the vowels.If the resulting string is empty print '-1'.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
codekata
OUTPUT
tkdc*/