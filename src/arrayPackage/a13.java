package arrayPackage;
import java.util.*;
public class a13 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int M=object.nextInt();
		int[][] array=new int[N][M];
		//int i,j = 0;
		for( int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				array[i][j]=object.nextInt();
			}
		}
		//Arrays.sort(array);
		//System.out.println(array);
		for( int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
        
	}

}
/*Mr.Stark wants to order the employee ids, which are recorded in a 2D matrix, in ascending order. He wants to do it so as to allot a new id to a person who joins as a fresher. You are the CTO of the Stark industries and you are asked by Mr.Stark to sort the data.
 

Input Description:
Dimensions of the matrix m and n, followed by the elements of the matrix.

Output Description:
Matrix sorted in ascending order

Sample Input :
3 3
87 21 34
89 32 78
12 23 45
Sample Output :
12 21 23
32 34 45
78 87 89*/