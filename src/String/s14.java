package String;
	import java.util.*;
	public class s14 {
	
		public static void main(String[] args) {
			Scanner object=new Scanner(System.in);
	        String s=object.nextLine();
	        char[] a=new char[s.length()];
	        for(int i=0;i<s.length();i++) {
	        	a[i]=s.charAt(i);
	        }
	        for(int i=0;i<s.length();i++) {
	        	int a1=s.length()/2;
	        	if(i==a1 &&s.length()%2!=0) {
	        		System.out.print("*");
	        	}
	        	else if(i==a1 ||i==a1-1 &&s.length()%2==0){
	        		System.out.print("*");
	        	}
	        	else {
	        		System.out.print(a[i]);
	        	}
	        }
		}
	
	}
/*Given a string S, print it after changing the middle element to * (if the length of the string is even, change the 2 middle elements to *).
Sample Testcase :
INPUT
hello
OUTPUT
he*lo*/