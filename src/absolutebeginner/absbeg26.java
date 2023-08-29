package absolutebeginner;
import java.util.Scanner;
public class absbeg26 {
	  public static void main(String[] args){
	        Scanner object=new Scanner(System.in);
	        float a=object.nextFloat();
	        float c=(float) (2*3.14*a);
	        System.out.print(String.format("%.2f", c));
	    }
	}

	/*You are provided with the radius of a circle "A". Find the length of its circumference.

Note: In case the output is coming in decimal, roundoff to 2nd decimal place. In case the input is a negative number, print "Error".

Input Description:
The Radius of a circle is provided as the input of the program.

Output Description:
Calculate and print the Circumference of the circle corresponding to the input radius up to two decimal places.

Sample Input :
2
Sample Output :
12.57*/