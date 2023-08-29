package ZenPack;
import java.util.*;
public class Zen49 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=object.nextInt();
					}
		for(int j=0;j<n;j++) {
			y[j]=object.nextInt();
		}	
		int k;
		for(k=0;k<n-1;k++) {
			System.out.print(x[k]+y[k]+" ");
		}
         System.out.print(x[k]+y[k]);

	}

}
/*Given a numbers n  followed by x and y array of n numbers add the array x and y and print the numbers

Input Description:
0<n<100 Given a number n Followed by n number in next line Followed by n number in next line

Output Description:
Print added n numbers

Sample Input :
6
5 7 4 4 6 8
1 2 3 5 1 1
Sample Output :
6 9 7 9 7 9*/