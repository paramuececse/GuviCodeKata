package pattern;
import java.util.Scanner;
public class pattern11 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1||j==1)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			for(int j=2;j<=i;j++) {
				if(i==j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int j=1;j<n;j++) {
			System.out.print(j+" ");
		}
           System.out.print(n);
	}

}
/*Generate a hollow inverted half pyramid pattern using numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the hollow inverted half pyramid pattern using numbers based on the given integer R.

Sample Input :
5
Sample Output :
    1
   1 2
  1   3
 1     4
1 2 3 4 5 */