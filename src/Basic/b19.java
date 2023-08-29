package Basic;

import java.util.*;
public class b19 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		int[] array=new int[N];
		for(int i=0;i<N;i++) {
			array[i]=object.nextInt();
			}

int a=0;
		for(int j=0;j<N;j++) {
			if(K==array[j]) {
				a=0;
				break;
			}
			else{
				a=-1;
			}
		}
	
	System.out.println(a);
	
	
	}
}


/*Given 2 numbers N and K followed by N elements,print the number of repetition of K otherwise print '-1' if the element not found.
Sample Testcase :
INPUT
6 2
1 2 3 5 7 8
OUTPUT
0*/