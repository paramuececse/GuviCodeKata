package BitManipulation;
import java.util.*;
public class BM1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
	if(	method(n)==1)
       System.out.println(1);
       else
    	   System.out.println(0);
	}

	public static int method(int n) {
		if(n%8==0) {
			return 1;
		}
		return 0;
		
	}

}
/*You are given a number ‘n’ you have to tell whether number is divisible by 8.

Print 1 if it is divisible and 0 if it is not.

Input Description:
You are given a number ‘n’.

Output Description:
Print 1 if number is divisible by 8 and 0 if not

Sample Input :
16
Sample Output :
1*/