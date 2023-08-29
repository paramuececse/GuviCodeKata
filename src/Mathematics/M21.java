package Mathematics;
import java.util.Scanner;
public class M21 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int temp=n;
	int remainder=0,sum=0;
	while(n>0) {
		remainder=n%10;
		sum=sum*10+remainder;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println(temp);
	}
	else {
		System.out.println("error");
	}
}
}

/*Simi is learning about palindromic numbers. Her teacher gave him the task to count all palindromic numbers present in that range.Simi has told you about this and want your help. You design an algorithm in order to help simi.

Input Description:
You will be given a number ‘n’

Output Description:
Print the count of all palindromic numbers till ‘n’(inclusive)

Sample Input :
5
Sample Output :
5*/