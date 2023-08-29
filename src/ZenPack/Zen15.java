package ZenPack;
import java.util.*;
public class Zen15 {
public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int sum=0;
		int count=0;
		while(n>0) {
			int remainder=n%10;
			count++;
			 //sum=sum*10+remainder;
			n=n/10;
		}
		//System.out.println(sum);
             System.out.println(count);
	}

}
/*Given a number  n Find the number of the digits of number n

Input Description:
0<n<10000 Given number n

Output Description:
Print the number of the digits of number n

Sample Input :
3589
Sample Output :
4*/