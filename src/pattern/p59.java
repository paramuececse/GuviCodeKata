package pattern;
import java.util.Scanner;
public class p59 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=1;
		for(int i=n;i>=1;i--) {
			for(int j=m;j<=n+n;j++) {
				if(i<=n && j%2!=0 ) {
					System.out.print(j);
				}
			}m=m+2;
			System.out.println();
		}

	}

}
/*Write a code to generate a half pyramid pattern using numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the number half pyramid pattern with the size R.

Sample Input :
5
Sample Output :
13579
3579
579
79
9*/