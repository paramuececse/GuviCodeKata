package pattern;

import java.util.Scanner;
public class p47 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			
		}

	}

}
/*Write a code to generate a pyramid pattern on numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the pyramid number pattern based on the given integer R.

Sample Input :
5
Sample Output :
    0
   101
  21012
 3210123
432101234*/