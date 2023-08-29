package pattern;
import java.util.Scanner;
public class p20 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1||j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=2;j<=i;j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int j=1;j<n;j++) {
			System.out.print("*"+" ");
		}
           System.out.print("*");
	}


	}


/*Write a code to generate a hollow full pyramid pattern using stars.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the star hollow full pyramid with the given integer R.

Sample Input :
5
Sample Output :
    *
   * *
  *   *
 *     *
* * * * * */