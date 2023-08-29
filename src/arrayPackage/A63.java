package arrayPackage;
import java.util.*;
public class A63 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		
		String s1=object.next();
		String s2=object.next();
				if(s1.equals(s2)) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}

	}

}
/*Given 2 strings S1 and s2, check whether they are case senitively equal without using any predefined function(case sensitive).If they are not same print 'no'
Sample Testcase :
INPUT
guvi guvi
OUTPUT
yes*/