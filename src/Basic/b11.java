package Basic;
import java.util.Scanner;
public class b11 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int length=object.nextInt();
	int breath=object.nextInt();
	float triangle=(float)(length*breath)/2;
	System.out.println(triangle);
}
}
/*Given base(B) and height(H) of a triangle find its area.
Input Size : N <= 1000000
Sample Testcase :
INPUT
2 4
OUTPUT
4*/