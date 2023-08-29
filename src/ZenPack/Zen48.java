package ZenPack;
import java.util.*;
public class Zen48 {

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
		
		for( int i=0;i<row;i++) {
			for( int j=0;j<column;j=i) {
				
			}			
		}
	
		
	}

}
/*Given a numbers n followed by n*n numbers in matrix format print the sum of the numbers in the column

Input Description:
You will given a number n followed by n*m numbers in matrix format .

Output Description:
print the sum of the numbers in the column

Sample Input :
3 3
1 2 3
4 5 6
7 8 9
Sample Output :
12 15 18*/