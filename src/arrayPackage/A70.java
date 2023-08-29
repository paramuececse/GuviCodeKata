package arrayPackage;
import java.util.*;
public class A70 {

	
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		int[] array =new int [N];
		
		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		
		}
		System.out.println(method(array,K));
	
		}
	public static String method(int array[],int K) 
	{
		
		for(int j=0;j<array.length;j++) {
			if(K==array[j]) {
				return "yes";
			}
			}
		return "no";
		
		}

}
		
		

		

	


/*Given 2 numbers N,K followed by a sorted array of N elements, search and tell if an element K is present in the array.print 'yes' if element is present otherwise print 'no'.
Input Size : 1 <= N <= 1000000000000000(Do it in logN time complexity)
Sample Testcase :
INPUT
3 2
2 3 7
OUTPUT
Yes*/