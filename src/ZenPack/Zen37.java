package ZenPack;
import java.util.*;
public class Zen37 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
			
		}
		int smallest=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]<smallest) {
				smallest=array[i];
			}
		}
		Arrays.sort(array);
		int secondsmallest=array[n-1];
		for(int i=0;i<n;i++) {
			if(array[i]!=smallest && array[i]<secondsmallest ) {
				secondsmallest=array[i];
			}
		}
		System.out.println(smallest);
System.out.println(secondsmallest);
	}

}
/*Given a number n followed by n numbers Print the 2nd  smallest number in an array

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the 2nd smallest number in an array

Sample Input :
6
5 7 4 4 6 8
Sample Output :
5*/