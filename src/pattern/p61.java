package pattern;
import java.util.*;
public class p61 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int i,j;
		for( i=1;i<=n;i++) {
			for( j=1;j<=i;j++) {
				if(i>=j)
					System.out.print(j*j);
				if(j!=i)
					System.out.print(" ");
				}
			
			System.out.println();
		}
		for( i=n-1;i>=1;i--) {
			for( j=1;j<=n-1;j++) {
				if(i>=j)
					System.out.print(j*j);
				if(i>j)
					System.out.print(" ");
				}
			
			System.out.println();
		}

	}

}
/*Input Description:
Given an integer R indicates number of R*2-1 rows.

Where 1<=R<=100.

Output Description:
Print the square pyramid number based on the given integer R.

Sample Input :
5
Sample Output :
1
1 4
1 4 9
1 4 9 16
1 4 9 16 25
1 4 9 16
1 4 9
1 4
1*/