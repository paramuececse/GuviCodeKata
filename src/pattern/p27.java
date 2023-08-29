package pattern;
import java.util.*;
public class p27 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n+n;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<m;j++) {
				System.out.print(j);
			}
			m=m-2;
			System.out.println();
		}

	}

}
/*Generate a number pyramid pattern.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100

Output Description:
Print the number half pyramid pattern with the size R.

Sample Input :
4
Sample Output :
1234567
12345
123
1*/