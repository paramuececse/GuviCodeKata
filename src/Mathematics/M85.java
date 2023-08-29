package Mathematics;
import java.util.*;
import java.lang.Math;
public class M85 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int A=object.nextInt();
		int B=object.nextInt();
		int C=object.nextInt();
		int formula=(int) (Math.pow(A, B)%C);
	     System.out.println((A^B)%C);
		System.out.println(formula);
	}

}
/*Given 3 numbers A,B,C find (A^B)%C.
Input Size : A,B,C <= 1000000000
Sample Testcase :
INPUT
3 4 1000000007
OUTPUT
81*/