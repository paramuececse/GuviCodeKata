package Mathematics;
import java.util.*;
public class M58 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
				}
		System.out.print(n);
	}
}
/*Given a number N, print its factors.
Input Size : n<=1000
Sample Testcase :
INPUT
6
OUTPUT
1 2 3 6*/