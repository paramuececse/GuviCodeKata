package Mathematics;
import java.util.*;
import java.lang.Math;
public class M118 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
         int n=object.nextInt();
         String s=Integer.toString(n);
         int[] array=new int[s.length()];
         
         for(int i=0;i<s.length();i++) {
        	 array[i]=Character.getNumericValue(s.charAt(i));
	}
         int sum=0,value=0;
	for(int j=0;j<s.length();j++) {
		value=array[j];
		sum= (int) (sum+ Math.pow(value,j));
	}
	System.out.println(sum);
	}}
/*Given a number N, Print sum of every didgit to the power of 
 * the weight of corresponding digit(Explanation : 
 * If the input is 12345 and then output calculated 
 * as (1^0)+(2^1)+(3^2)+(4^3)+(5^4)).
 */
//Input Size : 1 <= N <= 100000
//Sample Testcase :
//INPUT
//100
//OUTPUT
//1*/