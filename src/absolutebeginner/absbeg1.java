package absolutebeginner;
import java.util.Scanner;
public class absbeg1 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int a=object.nextInt();
	int fact=1;
	for(int i=1;i<=a;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
	}
}
/*You are provided with a number, "N". Find its factorial.

Input Description:
A positive integer is provided as an input.

Output Description:
Print the factorial of the integer.

Sample Input :
2
Sample Output :
2*/