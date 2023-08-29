package arrayPackage;
import java.util.*;
public class A185 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array =new int [N];

		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}	
		
		String result=method(N,array);
		System.out.println(result);
	}	
		
	

	private static String method(int n, int[] array) {
			for(int i=0;i<array.length;i++) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j] ){
						return "no";
					}
				
				}
				//return "no";
			}
			return "yes";
			
		
	}

	

}
/*Given a number N and an array of N integers, check if its a permutation of(1-N).
Input Size : N <= 100000
Sample Testcase :
INPUT
5
1 2 3 4 5
OUTPUT
yes*/