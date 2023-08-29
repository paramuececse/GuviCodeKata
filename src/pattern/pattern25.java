package pattern;
import java.util.Scanner;
public class pattern25 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n;
		for(int i=n;i>=1;i--) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i>j)
					System.out.print("*"+" ");
				else 
					System.out.print("*");
			
			
		}
			System.out.println();
	}

}
}
/*Write a code to generate an inverted full pyramid pattern using stars.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the star inverted full pyramid with the given integer R.

Sample Input :
5
Sample Output :
* * * * *
 * * * *
  * * *
   * *
    *        */