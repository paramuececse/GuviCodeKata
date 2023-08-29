package absolutebeginner;
import java.util.Scanner;
import java.lang.Math;
public class absbeg9 {
    public static void main(String[] args) {
    	Scanner object=new Scanner(System.in);
    	double a=object.nextDouble();
    	double sq=Math.sqrt(3)/4*a*a;  //important.
    	System.out.println(String.format("%.2f", sq));
    	
    }
}




/*The area of an equilateral triangle is ¼(√3a2) where "a" represents a side of the triangle. You are provided with the side "a". Find the area of the equilateral triangle.

Input Description:
The side of an equilateral triangle is provided as the input.

Output Description:
Find the area of the equilateral triangle and print the answer up to 2 decimal places after rounding off.

Sample Input :
20
Sample Output :
173.21*/