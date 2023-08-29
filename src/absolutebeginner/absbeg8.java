package absolutebeginner;
import java.util.Scanner;
public class absbeg8 {

	public static void main(String[] args) {
		Scanner Object=new Scanner(System.in);
        float P=Object.nextFloat();
        float T=Object.nextFloat();
        float R=Object.nextFloat();
        float SI;
        SI=P*T*R/100;
        System.out.print(String.format("%.2f",SI));
        }
}
/*You are given with Principle amount($), Interest Rate(%) and Time (years) in that order. Find Simple Interest.

Print the output up to two decimal places (Round-off if necessary).

(S.I. = P*T*R/100)

Input Description:
Three values are given to you as the input. these values correspond to Principle amount, Interest Rate and Time in that particular order.

Output Description:
Find the Simple interest and print it up to two decimal places. Round off if required.

Sample Input :
1000 2 5
Sample Output :
100.00*/
