package absolutebeginner;
import java.util.Scanner;
public class absbeg19 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int N=object.nextInt();
	int sum=0;
     for(int i=1;i<=N;i++) {
    	 sum=sum+i;
     }
     System.out.println(sum);
}
}
/*Write a code to get an integer N and print the sum of  values from 1 to N.

Input Description:
A single line contains an integer N.

Output Description:
Print the sum of values from 1 to N.

Sample Input :
10
Sample Output :
55*/