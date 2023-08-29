package Mathematics;
import java.util.*;
public class M82 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		int remainder=0,count=0;
        int i=1;
        	while(n>0) {
        	remainder=n%2;
        	array[i]=remainder;
        	//System.out.print(remainder+" ");
        	n=n/2;
        	count++;	
        	i++;
        }
       // System.out.println(count);
        for(int j=count;j>0;j--) {
        	System.out.print(array[j]);
        }
	}

}
/*Given a number N in decimal convert it into binary value.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
OUTPUT
101*/