package pattern;
import java.util.Scanner;
public class p38 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n-1;
		int r=n;
		int i;
		for(i=1;i<n;i++) {
			for(int j=n;j>=i;j--) {
				if(i==j) {
					System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
				}
			System.out.println();
		}
		for(int k=1;k<r;k++) {
			System.out.print("*");
		}
		System.out.print("*");
		System.out.println();
		for(int i1=2;i1<=n;i1++) {
		for(int j=1;j<=i1;j++) {
			if(i1==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}m--;
		System.out.println();

	}}
	}


/*Write a code to generate a right arrow using patterns.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the right arrow pattern using stars based on the given integer R.

Sample Input :
5
Sample Output :
    *
   *
  *
 *
*****
 *
  *
   *
    * */