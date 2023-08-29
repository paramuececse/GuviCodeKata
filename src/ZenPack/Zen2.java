package ZenPack;
import java.util.*;
public class Zen2 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int m=object.nextInt();
		int k=object.nextInt();
		for(int i=m+1;i<k-1;i++) {
			System.out.print(i+" ");
		}
          System.out.println(k-1);
	}
   
}
/*Given a number m and k separated by a space print the numbers between m and k

Input Description:
number m and n separated by a space 0<m<1000 0<n<1000 m<n

Output Description:
print the numbers between this two numbers

Sample Input :
5 8
Sample Output :
6 7*/