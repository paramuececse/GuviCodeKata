package ZenPack;
import java.util.*;
public class Zen21 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		if(n%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
/*Given a year, find whether leap year or not?

Input Description:
Given a 4 digit number

Output Description:
Print leap year or not a leap year

Sample Input :
1996
Sample Output :
leap year*/