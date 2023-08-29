package pattern;
import java.util.Scanner;
public class p4 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=object.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<b;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

	}

}
/*Generate a solid rectangle using stars. 

Input Description:
Given an integer R indicates no of rows and an integer C indicates no of columns.

Where 1<=R<=100 and Where 1<=C<=100.

Output Description:
Print the rectangle using stars with R rows and C columns.

Sample Input :
3 5
Sample Output :
* * * * *
* * * * *
* * * * *   */