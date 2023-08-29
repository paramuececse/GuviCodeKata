package pattern;
import java.util.Scanner;
public class p18 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(1);
        	}
        	System.out.println();
        }
	}

}
/*Write a code to generate a square pattern using the number '1'.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the square pattern with the number '1' in R*R form based on the given integer R.

Sample Input :
5
Sample Output :
11111
11111
11111
11111
11111*/