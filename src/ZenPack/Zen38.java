package ZenPack;
import java.util.*;
public class Zen38 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
        int large=0;
        for(int i=0;i<n;i++) {
        	if( array[i]>large) {
        		large=array[i];
        	}
        }
        //System.out.println(large);
        int secondlarge=0;
        int index=0;
        for( int i=0;i<n;i++) {
        	if( array[i]>secondlarge && array[i]!=large) {
        		secondlarge=array[i];
        		index=i;
        	}
        }
        System.out.println(index+1);
        
	}

}
/*Given a number n followed by n numbers Print the index 2nd  largest number in an array (1 base index)

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the largest number index in an array

Sample Input :
6
5 7 4 4 6 8
Sample Output :
2*/