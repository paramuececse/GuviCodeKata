package Mathematics;
import java.util.Scanner;
public class M104 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int count=1;
		for(int i=2;i>=n/2;i++) {
			if(i%2==0 )
				count++;
			if(count==n) {
			System.out.print(i);
			break;
		}
		}
	}

}
/*Gunjan was going through the book of ‘hyp’ numbers. She is given task to find the nth hyp number.Your task is to help gunjan

A hyp number is a number whose all digits are prime.

Input Description:
You are given a number ‘n’.

Output Description:
Print the ‘nth’ hyp number.

Sample Input :
3
Sample Output :
5*/