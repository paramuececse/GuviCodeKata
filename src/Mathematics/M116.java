package Mathematics;
import java.util.*;
public class M116 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		int count=1;
		int i;
		for( i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j]) {
					count++;
					break;
				}
			}
			if(count ==1) {
				System.out.print(array[i]);
			}
		}
		
		
	}

}
/*Given a number N and an array of N elements, every number is repeated except for one. Print that one number.
Input Size : 1 <= N <= 100000
Sample Testcase :
INPUT
10
1 2 3 2 3 3 2 5 5 2
OUTPUT
1*/