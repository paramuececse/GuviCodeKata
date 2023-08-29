package arrayPackage;
import java.util.*;
public class A33 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		String s="";
		System.out.println(1);
		for(int i=0;i<n-1;i++) {
			System.out.print(1);
			s=s+" 1 1";
			System.out.println(s);
		}

	}

}
/*Given a number N print a right angled traingle structure with the starting level as single 1 and every immediate proceeding level with 2 more additional ones than the previous level .Repeat the pattern for N levels.
Input Size : N <= 1000
Sample Testcase :
INPUT
3
OUTPUT
1
1 1 1
1 1 1 1 1*/