package pattern;
import java.util.Scanner;
public class p43 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++) {
				if(i<=m)
					System.out.print((char)(m+64));
			}m=m+2;
			System.out.println();
		}

	}

}
/*Write a code to generate a alphabet pyramid pattern.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=13.

Output Description:
Print the alphabet pyramid pattern according to the given integer R.

Sample Input :
5
Sample Output :
    A
   CCC
  EEEEE
 GGGGGGG
IIIIIIIII*/