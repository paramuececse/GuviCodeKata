package Basic;
import java.util.Scanner;
public class b17 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);	
		int N=object.nextInt();
	    int K=object.nextInt();
		int[] arr=new int[N];
		int j;
		for( j=0;j<N;j++) {
			arr[j]=object.nextInt();
		}
		int m;
		String test = "no";
		for( m=0;m<N;m++) {
			if(arr[m]==K) {
				test = "yes";
				//break;
			}
		}
		
	System.out.println(test);
		}
	       
	}   

/*Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'.
Sample Testcase :
INPUT
5 5
OUTPUT
yes*/