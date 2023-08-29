package pattern;
import java.util.Scanner;
public class p41 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			if(j%2!=0) {
				System.out.print(j);
			}
			else {
				System.out.print(j);
			}
			}m++;
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
1
24
135
2468
13579*/