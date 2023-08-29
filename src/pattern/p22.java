package pattern;
import java.util.Scanner;
public class p22 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n;
		for(int i=1;i<=n;i++) {
			for(int j=m;j<=n;j++) {
				System.out.print(j);
			}m--;
		System.out.println();
		}
			
		}

	}


/*Write a code to generate a half pyramid pattern using numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100

Output Description:
Print the number half pyramid pattern with the size R.

Sample Input :
5
Sample Output :
5
45
345
2345
12345*/