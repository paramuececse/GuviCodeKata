package Gcodekata;
import java.util.Scanner;
	public class IoFormat4 {
	    public static void main(String[] args){
	        Scanner object=new Scanner(System.in);
	        int row_size=3;
	        int col_size=2;
	        
	        int[][] array=new int[row_size][col_size];
	        
	        for(int i=0;i<row_size;i++){
	            for(int j=0;j<col_size;j++){
	                array[i][j]=object.nextInt();
	                
	            }
	        }
	        
	        for(int i=0;i<row_size;i++){
	            for(int j=0;j<col_size-1;j++){
	                System.out.print(array[i][j]);
	                System.out.print(" ");
	            }
	            System.out.print(array[i][col_size-1]);
	            System.out.println();
	        }
	    }
	}
