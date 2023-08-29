package pattern;
import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		 int rows=object.nextInt();
		 int cols=object.nextInt();
         for(int i=1;i<=rows;i++) {
        	 for(int j=1;j<=cols;j++) {
        		if(i==1||j==1||i==rows||j==cols) {
        			System.out.print("*");
        			if(j<cols)
        				System.out.print(" ");
        		}
        			else
        				System.out.print("  ");
        		
        	 }
        	System.out.println();
         }
	}

}
/*Write a code to generate a hollow rectangle using stars. 

Input Description:
Given an integer R indicates no of rows and an integer C indicates no of columns.

Where 1<=R<=100 and Where 1<=C<=100.

Output Description:
Print the hollow rectangle using stars with R rows and C columns.

Sample Input :
3 5
Sample Output :
* * * * *
*       *
* * * * **/