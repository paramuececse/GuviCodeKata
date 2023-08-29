package ZenPack;
import java.util.*;
public class Zen14 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=object.nextInt();
//		
        for(int i=1;i<n;i++) {
        	System.out.print( i*m +" ");
        }
        System.out.print(n*m);
	}

}
/*Given a number m and k separated by a space print n numbers which multiple of m

Input Description:
number m and k separated by a space 0<n<1000 0<m<1000

Output Description:
print n numbers which multiple of m

Sample Input :
5 4
Sample Output :
4 8 12 16 20*/