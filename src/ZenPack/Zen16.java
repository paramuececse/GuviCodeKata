package ZenPack;
import java.util.*;
public class Zen16 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int sum=0;
		
		while(n>0) {
			int remainder=n%10;
			
			sum=sum+remainder;
			n=n/10;
		}
		System.out.println(sum);
             
	}

}

/*Given a number n Find the sum of the digits of number n

Input Description:
0<n<1000 Given number n

Output Description:
Print the sum of the digits of number n

Sample Input :
3589
Sample Output :
25*/