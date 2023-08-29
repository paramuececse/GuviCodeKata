package Mathematics;
import java.util.Scanner;
public class M19 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
        if(a/b==1 && b%1==1 ) {
        	System.out.println(1);
        }
	}

}
/*Assume your brother studies in class 2. He has to  complete his homework on co-primes. As an elder sibling help him in finding whether the given two numbers is co-prime or not.

Input Description:
You will be given two numbers ‘n’ and ‘m’

Output Description:
Your task is to tell whether numbers is co prime or not. If it is a co-prime print 1 else 0

Sample Input :
3 5
Sample Output :
1*/