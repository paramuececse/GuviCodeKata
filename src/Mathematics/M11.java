package Mathematics;
import java.util.Scanner;
public class M11 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int remainder=0,sum=0;
	while(n>0) {
		remainder=n%10;
		sum=sum+remainder;
		n=n/10;
	}
	if(sum%3==0) {
		System.out.println("yes");
	}
	else {
		System.out.println("not");
	}
}
}
/*You are given a task to tell whether the number is pure or not. A pure number is a number whose sum of digits is multiple of 3.

O(1) time and O(1) space

Input Description:
You are given a number n.

Output Description:
Print yes if it is pure else not

Sample Input :
13
Sample Output :
not*/