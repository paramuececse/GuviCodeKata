package ZenPack;
import java.util.*;
public class Zen11 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int j,large=0;
        for( j=0;j<n;j++) {
        	if(array[j]>large) {
        		large=array[j];
        	}
        }
        System.out.println(large);

	}

}
/*Given a number n followed by n numbers Print the largest number in an array

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the largest number in an array

Sample Input :
6
5 7 4 4 6 8
Sample Output :
8*/