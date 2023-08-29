package ZenPack;
import java.util.*;
public class Zen1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		if(n%2==0 &&n%3==0&&n%5==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
/*Given a number n Find whether the number is divisible  by 2,3 and 5.if divisible print yes else print no

Input Description:
0<n<1000 Given a number n

Output Description:
Print yes or no

Sample Input :
30
Sample Output :
yes*/