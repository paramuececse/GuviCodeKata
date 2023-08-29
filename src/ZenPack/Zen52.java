package ZenPack;
import java.util.*;
public class Zen52 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        
        Arrays.sort(array);
        int i;
        for( i=array.length-1;i>0;i--) {
        	System.out.print(array[i]+" ");
        }
        System.out.print(array[i]);
	}

}
/*Given a number n followed by n numbers short the n number in descending order 

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print short the n number in descending order

Sample Input :
6
5 7 4 4 6 8
Sample Output :
8 7 6 5 4 4*/