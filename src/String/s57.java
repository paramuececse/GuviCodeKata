package String;
import java.util.*;
public class s57 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		String sat="saturday";
		String sun="sunday";
        if(s.equals(sat)||s.equals(sun)) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
	}

}
/*Given a day, print 'yes' if it is a holiday otherwise print'no'.Assume that weekend days are holidays
Sample Testcase :
INPUT
saturday
OUTPUT
yes
INPUT
monday
OUTPUT
no*/