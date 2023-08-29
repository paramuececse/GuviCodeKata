package ZenPack;
import java.util.*;
public class Zen17 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
      for(int i=0;i<n;i++) {
      	array[i]=object.nextInt();
      }
      Arrays.sort(array);
      int j;
      for(j=0;j<n-1;j++) {
    	System.out.print(array[j]+" ");
      }
      System.out.print(array[j]);
	}
}
/*Given a number n followed by n numbers short the n number in ascending order 

 

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the n number in ascending order

Sample Input :
6
5 7 4 4 6 8
Sample Output :
4 4 5 6 7 8*/