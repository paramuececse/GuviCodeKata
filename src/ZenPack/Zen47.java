package ZenPack;
import java.util.*;
public class Zen47 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int row=object.nextInt();
		int column=object.nextInt();
		int count=1;
		int[][] array=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array[i][j]= object.nextInt();
			}
		}
		int sum=0;
		for( int i=0;i<row;i++) {
			for( int j=0;j<column;j++) {
				if(array[i][j]%2==0) {
				sum=sum+array[i][j];	
				}
			}
			
			
		}
		System.out.println(sum);

	}

}
/* Given a numbers n and m followed by n*m numbers in matrix format print the sum of the elements in the matrix the element which is even number

Input Description:
You will given a number n and m followed by n*m numbers in matrix format . 0<n<100 0,m<100

Output Description:
print the sum of the elements in the matrix the element which is even number

Sample Input :
3 3
1 2 3
4 5 6
7 8 9
Sample Output :
20*/