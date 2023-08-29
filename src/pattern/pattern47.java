package pattern;
import java.util.Scanner;
public class pattern47 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--) {
				if(i>=j)
					System.out.print(j);
			}
			for(int j=1;j<=i;j++) {
				if(i>=j)
					System.out.print(j);
					
			}
			System.out.println();
		}
	}

}
/*Write a code to generate a pyramid pattern on numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the pyramid number pattern based on the given integer R.

Sample Input :
5
Sample Output :
    0
   101
  21012
 3210123
432101234*/