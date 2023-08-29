package Mathematics;
import java.util.*;
public class M121 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
        if(N%11==0) {
        	System.out.println("YES");
        }
        else {
        	System.out.println("NO");
        }
	}

}
/*Given an integer N, find if it is divisible by 11

 

N >= 1

1 <= No. of digits in N <= 1000

Input Description:
The only line of input contains an integer N

Output Description:
Print YES if N is divisible by 11, NO otherwise.

Sample Input :
1331
Sample Output :
YES*/