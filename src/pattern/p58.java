package pattern;
import java.util.Scanner;
public class p58 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}

	}

}
/*Write a code to generate a aplhabet half pyramid pattern.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=26.

Output Description:
Print the alphabet half pyramid pattern according to the given integer R.

Sample Input :
5
Sample Output :
ABCDE
 ABCD
  ABC
   AB
    A */