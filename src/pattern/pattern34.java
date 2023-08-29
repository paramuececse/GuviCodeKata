package pattern;
import java.util.Scanner;
public class pattern34 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n-1;
		int r=n;
		int i;
		for(i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
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
		for(int i1=1;i1<=n;i1++) {
		for(int j=1;j<=m;j++) {
			if(j==m) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}m--;
		System.out.println();

	}}
	}


/*Write a code to generate a left arrow pattern using stars.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the left arrow pattern based on the given integer R.

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
*     */