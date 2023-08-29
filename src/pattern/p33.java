package pattern;
import java.util.Scanner;
public class p33 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+65-1));
			}
			
			
				for(int j=1;j<=i-1;j++) {
					System.out.print((char)(j+65-1));
				}
				System.out.println();
		}
			

	}

}
/*Write a code to generate a aplhabet pyramid pattern.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=26.

Output Description:
Print the alphabet pyramid pattern according to the given integer R.

Sample Input :
5
Sample Output :
    A
   ABA
  ABCAB
 ABCDABC
ABCDEABCD*/