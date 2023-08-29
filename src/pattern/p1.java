package pattern;
import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(k++);
				System.out.print(" ");
			}
			System.out.print(k++);
			System.out.println();
		}

	}

}
/*Generate a floyd's triangle.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print a floyd's triangle based on the given integer R.

Sample Input :
5
Sample Output :
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15*/