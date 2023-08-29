package pattern;
import java.util.Scanner;
public class p14 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n;
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				
				System.out.print("*");
				
				if(m<=n)
				System.out.print("  ");
			}
			    System.out.print("*");
			m--;
				System.out.println();
		}
                System.out.println("*");
	}

}
/*Write a code to generate an inverted half pyramid pattern using stars.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the star inverted pyramid with the given integer R.

Sample Input :
5
Sample Output :
*  *  *  *  *
*  *  *  *
*  *  *
*  *
**/