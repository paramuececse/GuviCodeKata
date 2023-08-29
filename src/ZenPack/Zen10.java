package ZenPack;
import java.util.*;
public class Zen10 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        
        method(n,array); 
	}

	private static void method(int n, int[] array) {
		int j;
		for( j=0;j<n-1;j++) {
        	if(array[j]%2==0) {
        		System.out.println( "even");
        	}
        	else {
        		System.out.print("odd");
        	}
        	System.out.print(" ");
        }
		if(array[n-1]%2==0) {
			System.out.print("even");
		}else {
			System.out.print("odd");
		}
		
	}

}
/*Given a number n followed by n numbers find whether it is odd or even

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print whether odd or even

Sample Input :
3
5 7 4
Sample Output :
odd odd even*/