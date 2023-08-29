package pattern;
import java.util.Scanner;
public class p60 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
       int n=object.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=n-i;j>=1;j--) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=n;j++) {
    		   if(i==1 ||j==1||i==n||j==n) {
    			   System.out.print("*");
    		   }
    		   else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
/*Write a code to generate an hollow rhombus Pattern using stars.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the solid rhombus using stars with the size R.

Sample Input :
4
Sample Output :
   ****
  *  *
 *  *
**** */