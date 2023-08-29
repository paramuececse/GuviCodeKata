package Mathematics;
import java.util.*;
public class M138 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-1;j++) {
				System.out.print(1+" ");
				
			}
			System.out.print(1);
			System.out.println();
			a--;
		}
		System.out.println(1);

	}

}
/*Given a number N print the right-angled triangle with the top level having N 1's followed by each level with is one 1 lesser.
Input Size : N <= 1000
Sample Testcase :
INPUT
3
OUTPUT
1 1 1
1 1
1*/