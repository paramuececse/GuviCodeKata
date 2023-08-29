package Basic;
import java.util.Scanner;
public class b4 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
         int N=object.nextInt();
         int M=object.nextInt();
         int SUM;
         SUM=N+M;
         if(SUM%2==0) {
        	 System.out.println("even");
         }
         else {
        	 System.out.println("odd");
         }
	}

}
/*Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.
Sample Testcase :
INPUT
9 2
OUTPUT
odd*/