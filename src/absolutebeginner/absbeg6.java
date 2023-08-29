package absolutebeginner;
import java.util.Scanner;
public class absbeg6 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int i;
	    for( i=1;i<=3-1;i++) {
	    	System.out.print(a*i + " " );
	    }
	    System.out.print(a*i);
	}

}
/*Print the First 3 multiples of the given number "N". (N is a positive integer)

Note: print the characters with a single space between them.

Input Description:
A positive integer is provided to you as an input.

Output Description:
Print the First 3 multiples of the number with single spaces between them as an output.

Sample Input :
2
Sample Output :
2 4 6*/