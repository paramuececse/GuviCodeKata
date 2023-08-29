package numbers;
import java.util.*;
public class number8 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int sum=0;
		while(n>0) {
			int remainder;
			remainder=n%10;
			sum=sum+remainder;
			n=n/10;
		}
		if(sum%4==0)
		System.out.println("yes");
		else
			System.out.println("no");
	}

}
/*Rampal is a number in which the sum of last two digits of that number is multiple of 4.Your teacher has given you the task to make a list of rampal numbers.Your task is to tell whether the number is rampal or not.

 

Note : if the number is negative than rampal is a number which has sum of first and last digit as multiple of 4  

Input Description:
First line contains an input n

Output Description:
Print yes or no

Sample Input :
20

Sample Output :
no*/