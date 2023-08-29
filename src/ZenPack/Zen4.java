package ZenPack;
import java.util.*;
public class Zen4 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
        	sum=sum+array[i];
        }
          System.out.println(sum);
	}

}
/*Given a number n followed by n numbers Find the sum of the elements in an array

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the sum of the elements in an array

Sample Input :
3
5 7 4
Sample Output :
16*/