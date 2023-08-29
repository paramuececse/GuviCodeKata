package pattern;
import java.util.*;
public class p37 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int m=a;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(j);
			}
			System.out.println();
			m--;
		}

	}

}
/*Write a code to generate a half pyramid number pattern.

Input Description:
Given an even integer R indicates number of rows.

Where 1<=R<=100

Output Description:
Print the number pattern based on the given integer R.

Sample Input :
5
Sample Output :
12345
1234
123
12
1*/