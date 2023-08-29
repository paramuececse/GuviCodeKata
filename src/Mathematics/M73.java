package Mathematics;
import java.util.*;
public class M73 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		int count=0,count1=0;;
		for(int i=0;i<s.length()-1;i++) {
			count=1;
			for(int j=i+1;i<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				//System.out.println("count"+count+"-->"+s.charAt(i));

			}
						if(count<=1) {
				count1++;
			}
			 System.out.println(count1);
		}
    
	}

}
/*Given a String S,print the number of unique characters in it.If all the characters are duplicated,then print -1.
Sample Testcase :
INPUT
GUVIGEEK
OUTPUT
4*/