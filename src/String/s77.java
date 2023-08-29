package String;
import java.util.*;
public class s77 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		char k=object.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==k) {
				count++;
			}
		}
            System.out.println(count);
	}

}
/*Given a string 'S' and a character 'K', find how many times 'K' got repeated in 'S'.If 'K' is not found in 'S' print -1
Input Size : |s| <= 100000
Sample Testcase :
INPUT
codekata a
OUTPUT
2*/