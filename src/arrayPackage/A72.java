package arrayPackage;
import java.util.*;
public class A72 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array =new int [N];

		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		 Arrays.sort(array);
//	}
//	static boolean issorted(int )
	}
}
/*Given a number N, followed by an array of N elements,print 'yes' if it is a sorted array(either ascending or descending)otherwise print 'no'.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
3
2 3 7
OUTPUT
yes*/