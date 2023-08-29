package pattern;
import java.util.*;
public class pattern21 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j)
				System.out.print("*");
				else
					System.out.print("b");
			}
			System.out.println();
		}
		
	}

}
/*Generate the following pattern.

*****

b****

bb***

bbb**

bbbb*

Input Description:
Input consists of a single integer that corresponds to n, the number of rows.

where 1<=n<=100.

Output Description:
Print the character pattern from the given input n.

Sample Input :
5
Sample Output :
*****
b****
bb***
bbb**
bbbb*
*/