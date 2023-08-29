package arrayPackage;
import java.util.*;
public class A37 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
			
		}
		int maximum=0;
            for(int j=0;j<n;j++) {
            	if(array[j]>maximum) {
            		maximum=array[j];
            		System.out.print(maximum);
            	}
            	
            }
	}

}
/*You are given an array F of focal lengths of size f, F[0], F[1],...F[f-1]. You are asked to determine the indices of the elements from the biggest element to the smallest element.

Input Description:
The first line contains an integer f. The next line contains f space separated integers F[i], (0 <= i <= f-1) Note: The elements of F[i] are pairwise distinct.

Output Description:
Print f space separated integers, denoting the indices of the elements, from biggest element to smallest.

Sample Input :
3
1 5 4
Sample Output :
1 2 0*/