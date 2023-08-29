package Mathematics;
import java.util.*;
public class M67 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char a[]=new char[s.length()];
		if(method(s,a)==true){
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
	}
		public static boolean method(String s, char[] a) {
			for(int i=0;i<s.length();i++) {
			a[i]=(char) Character.getNumericValue(s.charAt(i));
		}
		    for(int i=0;i<s.length();i++) {
			if(a[i]>=0&& a[i]<=9) {
				return true;
			}
		}
			return false;
		
	}
		

	}


/*Given a string S.Validate if a given string is numeric.print 'yes' if it is a numeric otherwise print 'no'.
Sample Testcase :
INPUT
guvigeeks
OUTPUT
no*/