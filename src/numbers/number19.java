package numbers;
import java.util.*;
public class number19 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int num=object.nextInt();
		String n=object.next();
		int[] array=new int[n.length()];
		int i,sum;
		for(i=0;i<n.length();i++) {
			array[i]=Character.getNumericValue(n.length());
			
		}
         sum=array[0]+array[1];
         System.out.println(sum);
         int sum1=0;
         while(num>0) {
        	 int remainder=num%10;
        	 sum1=sum1+remainder;
        	 System.out.println(sum1);
        	 if(sum==sum1) {
        		 System.out.println(sum1);
        		 break;
        	 }
        	 num=num/10;
         }
	}

}
/*You are given a number ‘n’.Your task is to develop an algorithm to tell whether the number is ‘ajs’ or not.An ‘ajs’ number is a number whose sum of first two digits is present in given number ‘n’

Input Description:
A number ’n’ is given to you

Output Description:
Print 1 if number is ajs or 0 if it is not

Sample Input :
9817
Sample Output :
1*/