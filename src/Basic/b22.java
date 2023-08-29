package Basic;
import java.util.*;
public class b22 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String charobject=object.next();
	    char[] sarray=new char[charobject.length()];	
		char[] temp = new char[charobject.length()];	;
		for(int i=0;i<sarray.length;i++) {
			sarray[i]=charobject.charAt(i);
			
		}
		
		for(int j=0;j<sarray.length;j=j+2) {
			temp[j]=sarray[j];
			sarray[j]=sarray[j+1];
			sarray[j+1]=temp[j];
			
		}
		System.out.println(sarray);
		

	}

	
}
/*Given a string 'S' swap the even and odd characters starting from index 1(Assume the index starts from 0).
Input Size : |s| <= 10000000(complexity O(n))
Sample Testcase :
INPUT
codekata
OUTPUT
ocedakat*/