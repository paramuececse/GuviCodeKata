package pattern;
import java.util.*;
public class p15 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 ||i==j) {
					System.out.print(j);
				}
				else if(i==n){
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
	}

}
/*Generate a hollow half pyramid pattern using numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the hollow half pyramid pattern using numbers based on the given integer R.

Sample Input :
5
Sample Output :
1
12
1 3
1  4
12345*/