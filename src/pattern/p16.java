package pattern;

import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 ||j==m||j==1)
					System.out.print(j);
				else
					System.out.print(" ");
			}m--;
			System.out.println();
			}
	}

}
/*Generate a hollow inverted half pyramid pattern using numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the hollow Inverted half pyramid pattern using numbers based on the given integer R.

Sample Input :
5
Sample Output :
12345
1  4
1 3
12
1*/