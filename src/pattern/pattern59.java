package pattern;
import java.util.*;
public class pattern59 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int k=n;
		
		for(int i=1;i<=n;i++) {
			int m=1;
			int l=m;
			for(int j=1;j<=k;j++) {
				
				
				System.out.print(l);
				l=l+2;
			}
			m=l+2;
			
			k--;
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
9
*/