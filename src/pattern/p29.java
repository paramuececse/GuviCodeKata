package pattern;
import java.util.*;
public class p29 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j>i)
				System.out.print("b");
				else
					System.out.print("*");
			}
			for(int j=1;j<=n-1;j++) {
				if(j>=i)
					System.out.print("b");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*Generate the following inverted character with star pattern.

bbbb*bbbb

bbb***bbb

bb*****bb

b*******b

*********

Input Description:
Input consists of a single integer that corresponds to R, the number of rows. R is always an odd number. where 1<=R<=100.

Output Description:
Print the inverted character pattern from the given input size R.

Sample Input :
5
Sample Output :
bbbb*bbbb
bbb***bbb
bb*****bb
b*******b
**********/