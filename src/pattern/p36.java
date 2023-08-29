package pattern;
import java.util.Scanner;
public class p36 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
         for(int  i=1;i<=n;i++) {
        	 for(int j=n;j>=1;j--) {
        		 if(i<j)
        			 System.out.print(" ");
        		 else
        			 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
/*Write a code to generate a pyramid using stars.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the pyramid pattern using stars based on the given integer R.

Sample Input :
6
Sample Output :
     *
    **
   ***
  ****
 *****
*******/
