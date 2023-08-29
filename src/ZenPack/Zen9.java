package ZenPack;
import java.util.*;
public class Zen9 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=object.nextInt();  
		int quotient=n/m;
		int remainder=n%m;
		System.out.print(quotient);
		System.out.print(" ");
		System.out.print(remainder);
	}

}
/* Given a two number n and m find the Quotient and remainder

Input Description:
0<n<10000 0<m<10000 Given two number separated by a space

Output Description:
Need to print Quotient and remainder separated by a space

Sample Input :
6 3
Sample Output :
2 0*/