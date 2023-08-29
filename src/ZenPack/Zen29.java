package ZenPack;
import java.util.*;
public class Zen29 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=object.nextInt();
		int[][] array=new int[n][m];
		int sum=0;
		for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		array[i][j]=object.nextInt();
        	}
        	}
		
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(array[i][j]%2!=0) {
        			sum=sum+array[i][j];
        		}
        	}
        }
        System.out.println(sum);
	}

}
/*Given a numbers n and m followed by n*n numbers in matrix format print the sum of the elements in the matrix in which sum of row value and column value is even(1 base index)

Input Description:
You will given a number n and m followed by n*m numbers in matrix format . 0<n<100 0<m<100

Output Description:
print the sum of the elements in the matrix in which sum of row value and column value is even

Sample Input :
3 3
1 2 3
4 5 6
7 8 9
Sample Output :
25*/