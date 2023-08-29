package ZenPack;
import java.util.*;
public class Zen7 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
     method(n,array);
	}

	public static int method(int n, int[] array) {
		int j;
		for( j=0;j<n-1;j++) {
			 if(array[j]<15) {
				System.out.print(array[j]+" ");
			}
			else {
				System.out.print( -1);
			}
		}
		   System.out.print(array[j]);
		return 0;
		
	 
	}

}
/*Given a number n followed by n numbers print the number less than 15 if there is no number exits print -1

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the number which is less than 15 if there is no number exits print -1

Sample Input :
3
5 7 4
Sample Output :
5 7 4*/