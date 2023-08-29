package Basic;
import java.util.*;
public class b16 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int A=object.nextInt();
	int B=object.nextInt();
	if(A>=1 && B<=50){
		System.out.println((int)Math.pow(A, B));
	}
	}

}
/*Given numbers A,B find A^B.
Input Size : 1 <= A <= 5 <= B <= 50
Sample Testcase :
INPUT
3 4
OUTPUT
81*/