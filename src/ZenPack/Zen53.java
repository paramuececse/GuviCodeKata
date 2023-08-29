package ZenPack;
import java.util.*;
public class Zen53 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        for(int i=0;i<n;i++) {
        	if(array[i]!=array[i+1]) {
        		System.out.print(array[i]+" ");
        	}
        }
            
	}

}
/*Given a number n followed by n numbers Remove  repeating numbers

Input Description:
0<n<100 Given a number n  Followed by n number in next line

Output Description:
Print the numbers which is non- repeating numbers

Sample Input :
6
5 7 4 4 6 8
Sample Output :
5 7 6 8*/