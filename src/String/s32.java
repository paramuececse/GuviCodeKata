package String;
import java.util.*;
public class s32{

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s1=object.nextLine();
		String s2=object.nextLine();

			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			int l1=ch1.length;
			int l2=ch2.length;
			int length=(l1>l2)?l1:l2;
			
			for(int i=0;i<length;i++) {
				
			}
		}
	
}
/*Given 2 strings,check whether they have any common characters.If found print 'yes' else print 'no'.
Input Size : |s| <= 100000(O(n))
Sample Testcase :
INPUT
guvi guvigeeks
OUTPUT
yes*/