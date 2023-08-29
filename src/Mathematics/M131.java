package Mathematics;
import java.util.*;
public class M131 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int a=object.nextInt();
	String s=Integer.toString(a);
	int[] array=new int[s.length()];
    
	for(int i=0;i<s.length();i++) {
		array[i]=Character.getNumericValue(s.charAt(i));
	}
	int sum=0;
	for(int j=0;j<s.length();j++) {
		if(array[j]%2!=0) {
			sum=sum+array[j];
		}
	}
	if(sum%2==0) {
		System.out.println("E");
	}
	else {
		System.out.println("O");
	}
	}

}
/*A number is given as input. Find the odd digits in the number,
 *  add them and find if the sum is odd or not. 
 *  If even print E, if odd print O.
 */
//Input Size : N <= 10000000000
//Sample Testcase :
//INPUT
//413
//OUTPUT
//E*/