package absolutebeginner;
import java.util.Scanner;
public class absbeg27 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int A=object.nextInt();
		if(A%4==0) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
	}

}
/*Let "A" be a year, write a program to check whether this year is a leap year or not.

Print "Y" if its a leap year and "N" if its a common year.

Input Description:
A Year is the input in the form of a positive integer.

Output Description:
Print "Y" if its a leap year and "N" if its a common year.

Sample Input :
2020
Sample Output :
Y*/