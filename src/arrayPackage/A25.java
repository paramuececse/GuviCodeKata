package arrayPackage;
import java.util.Scanner;
public class A25 {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String n=object.next();
		int[] array=new int[n.length()];
		String empty = "";
		for(int i=0;i<n.length();i++) {
			array[i]=(int)Character.getNumericValue(n.charAt(i));
		}
		boolean found=false;
		for(int i=0;i<n.length();i++) {
			if(array[i]%2!=0) {
				empty=empty+array[i];
				//System.out.print(empty[i]);
				found=true;
			}
		}
		if(found==true) {
		int i;
		for( i=0;i<empty.length()-1;i++) {
			System.out.print(empty.charAt(i)+" ");
		}
		System.out.print(empty.charAt(empty.length()-1));
		}
		else {
			System.out.println(-1);
		}
		
}
}
/*Given a number N, print the odd digits in the number(space seperated) or print -1 if there is no odd digit in the given number.
Input Size : N <= 100000
Sample Testcase :
INPUT
2143
OUTPUT
1 3*/