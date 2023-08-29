package Gcodekata;

import java.util.Scanner;

public class IoFormat6 {
	public static void main(String[] args){
		Scanner object=new Scanner(System.in);
        int[] array=new int[2];
		
        for(int k=0;k<2;k++) {
			array[k]=object.nextInt();	
		                  }
		
		
		     
		int[][] arr=new int[2][3];
		int row_size=2;
        int col_size=3;
        int i,j;
		
        for( i=0;i<row_size;i++) {
			for( j=0;j<col_size;j++) {
			arr[i][j]=object.nextInt();		
		}
		}
        
        for(int k=0;k<array.length-1;k++) 
        {
System.out.print(array[k]+" ");
     }
 System.out.println(array[1]);
 
                   for( i=0;i<row_size;i++){
	               for( j=0;j<col_size-1;j++){
	                System.out.print(arr[i][j]);
	                System.out.print(" ");
	                   }
	            System.out.print(arr[i][col_size-1]);
	            System.out.println();
	        }
		
		
}
}
/* Write a code to get the input in the given format and print the output in the given format

Input Description:
First-line indicates two integers separated by space. Second-line indicates three integers separated by space. Third-line indicates three integers separated by space

Output Description:
Print the input in the same format.

Sample Input :
2 5
2 5 6
2 4 5
Sample Output :
2 5
2 5 6
2 4 5 */