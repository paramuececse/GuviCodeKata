package absolutebeginner;
import java.util.Scanner;
public class absbeg21 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int a=object.nextInt();
    int b=object.nextInt();
    if(b%a==0) {
    	System.out.println(a);
    }
}
}
/*Write a code to get 2 integers as input and find the HCF of the 2 integer without using recursion or Euclidean algorithm.

Input Description:
A single line containing 2 integers separated by space.

Output Description:
Print the HCF of the integers.

Sample Input :
2 3
Sample Output :
1	*/