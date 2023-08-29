package arrayPackage;
import java.util.*;
import java.util.Arrays;
public class a61 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int k=object.nextInt();
		int[] array=new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
         Arrays.sort(array);
         for(int j=0;j<array.length;j++) {
        	 if(k>array[j]) {
        		 
        		 System.out.print(array[j]+ " ");
        	 }else {
        		 System.out.println();
        	 }
        	 
         }
        
         
	}

}
/*Given 2 numbers N,K followed by N elements print all the elements lesser than K in sorted order.If the elements could not be found print -1
Input Size : N <= 100000
Sample Testcase :
INPUT
5 3
1 2 1 4 1
OUTPUT
1 1 1 2*/