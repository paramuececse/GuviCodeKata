package Basic;
import java.util.Scanner;

public class b1 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);	
	int n=object.nextInt();
	//int temp=n;
	if(n%2==0 ||n%3==0) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
/*Given a number N, print 'yes' if it is composite else print 'no'.
Sample Testcase :
INPUT
123
OUTPUT
yes*/