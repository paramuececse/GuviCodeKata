package Mathematics;
import java.util.Scanner;
public class M10 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);	
     int n=object.nextInt();
     int count=0;
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<n;j++) {
    		 if(i+j==n) {
    			 count++;
    			// System.out.println(i + j);
    		 }
    	 }
     }
     System.out.println(count);
	}

}
/*You are given with a number ‘n’. You have to count the pair of two numbers a and b such that sum of two numbers are equal to n.

 

Note:Both numbers lie in range 1<=a,b<n

Input Description:
You are given a number ‘n’

Output Description:
Print the number of pairs satisfying above condition

Sample Input :
5
Sample Output :
4*/