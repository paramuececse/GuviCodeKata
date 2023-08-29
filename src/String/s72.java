package String;
import java.util.*;
public class s72 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		int k=object.nextInt();
		int i;
		for(i=k-1;i<s.length()-1;i=i+k) {
			
				System.out.print(s.charAt(i)+" ");
		}
		System.out.print(s.charAt(i));
	}

}
/*Given a string and a number K.Print every kth character from the beginning.
Sample Testcase :
INPUT
string 3
OUTPUT
r g*/