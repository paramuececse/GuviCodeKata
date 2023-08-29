package numbers;
import java.util.*;
public class number13 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int flag=0;
		int i,j;
		for( i=1;i<=n;i++) {
			for( j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=1;
				//break;
				
			}
		}
			if(flag==0)
			System.out.println(i);
		}
		
	}

}
/*Rohan is teacher at “Sunsdfghpol” academy about dfg numbers.Assume you are student of his coaching batch .He has given you some task.Your task is to print nth dfg  number.A dfg number is a number whose prime factors are only 2,3 or 5.

Input Description:
You are given a number ‘n’.

Output Description:
Print all the dfg numbers upto index ‘n’.

Sample Input :
2
Sample Output :
1 2*/