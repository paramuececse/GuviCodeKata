package Mathematics;
import java.util.Scanner;
public class M6 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m,j;
		int remainder,sum=0,multiply=1,add=0;
		int temp=n;
		while(n>0) {
			remainder=n%10;
			sum=sum+remainder;
			
			multiply=multiply*remainder;
			n=n/10;
		}
		//System.out.println(sum);
		//System.out.println(multiply);
		add=sum+multiply;
		//System.out.println(add);
		if(temp==add) {
			System.out.println("Great");
		}
		else {
			System.out.println("no");
		}
	}

}
/*You are given a number ‘n’. You have to tell whether a number is great or not. A great number is a number whose sum of digits let (m) and product of digits let(j) when summed together gives the number back

m+j=n

 

Input Description:
You are given a number n;

Output Description:
Print Great if a number is great else print the no

Sample Input :
59
Sample Output :
Great*/