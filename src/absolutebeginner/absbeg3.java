package absolutebeginner;
import java.util.Scanner;
public class absbeg3 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int km=object.nextInt();
	//int m;
	//int cm;
	System.out.println(km*1000);
	System.out.print(km*100000);
}
}
/* You are given a number A in Kilometers. Convert this into B: Meters and C: Centi-Metres.

Input Description:
A number "A" representing some distance in kilometer is provided to you as the input.

Output Description:
Convert and print this value in meters and centimeters.

Sample Input :
2
Sample Output :
2000
200000*/