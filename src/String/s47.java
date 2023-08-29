package String;
import java.util.*;
public class s47{

	

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.next();
	
	method( s);

	}

	public static  void method(String s) {
		String empty1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='a'&&s.charAt(i)!='e'  &&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u' ) {
				empty1=empty1+s.charAt(i);
				//System.out.print(empty1);
			}
		}
		
		//System.out.println();
		//System.out.print(empty1);
		String s2="";
		for(int j=empty1.length()-1;j>=0;j--) {
			s2=s2+empty1.charAt(j);
		}
		//System.out.println(s2);
		String s3=(s2.length()<1)?("-1"): (s2);
		System.out.print(s3);
	}
}
/*resulting string is empty print '-1'.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
codekata
OUTPUT
tkdc*/

/*public class ReverseStringWithoutVowels {
    public static String reverseStringWithoutVowels(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            if (!isVowel(currentChar)) {
                reversed.append(currentChar);
            }
        }

        if (reversed.length() == 0) {
            return "-1";
        }

        return reversed.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String input = "codekata";
        String reversedString = reverseStringWithoutVowels(input);
        System.out.println("Reversed string without vowels: " + reversedString);
    }
}
*/