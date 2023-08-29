package ZenPack;
import java.util.*;
public class Zen24 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
        int n=object.nextInt();
        int a=object.nextInt();
        int b=object.nextInt();
        int c=object.nextInt();
        if(a%n==0 && b%n==0 &&c%n==0 ||a%2==0 && b%2==0 &&c%2==0) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
	}

}
/*Given a number n,a,b and c Find the number n is divisible by a,b,c if divisible print yes else print no

Input Description:
Given number n,a,b and c separated by a space 0<n<1000 0<a<1000 0<b<1000 0<c<1000

Output Description:
Print yes or no

Sample Input :
3 5 8 9
Sample Output :
no*/