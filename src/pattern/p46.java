package pattern;
import java.util.Scanner;
public class p46 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++) {
				if(i<=j){
					System.out.print((char)(j+64));
				}
				else {
					System.out.print((char)(j+64));
				}
			}
			System.out.println();
			m=m+2;
		}

	}

}
/*Write a code to generate a alphabet pyramid pattern.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=26.

Output Description:
Print the alphabet pyramid pattern according to the given integer R.

Sample Input :
5
Sample Output :
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI*/