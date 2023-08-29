package numbers;
import java.util.Scanner;

public class n1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
         int n=object.nextInt();
         int sum=1,odd=1;
         for(int i=1;i<=n;i++) {
         sum=sum+odd;
         odd=odd+2;
         System.out.print(sum);
         if(i!=n)
         System.out.print(" ");
         }
         
         
	}

}
/*you are given with ‘arasu’ series(shown in example).You have to understand it and you will be given a number ‘n’ ,you have to print the series till n numbers.

Input Description:
You are given a number n;

Output Description:
Print series till nth number

Sample Input :
4
Sample Output :
2 5 10 17
*/