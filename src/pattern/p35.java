package pattern;
import java.util.*;
public class p35 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
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
EDCBA
EDCB
EDC
ED
E*/