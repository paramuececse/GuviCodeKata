package absolutebeginner;
import java.util.Scanner;
public class absbeg28 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		long a=object.nextLong();
		long remainder=0;
		long sum = 0;
		while(a>0) {
			remainder=a%10;
			sum= remainder+sum;
			a=a/10;
		}
		System.out.println(sum);
		
	}

}
/*Write a code get an integer number as input and print the sum of the digits.

Input Description:
A single line containing an integer.

Output Description:
Print the sum of the digits of the integer.

Sample Input :
124
Sample Output :
7*/