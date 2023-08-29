package Gcodekata;
import java.util.Scanner;
public class IoFormat8 {
     public static void main(String[] args) {
    	Scanner object=new Scanner(System.in);
    	float[] f=new float[3];
    	for(int i=0;i<3;i++) {
    		f[i]=object.nextFloat();
    	}
    	for(int i=0;i<3;i++) {
    		System.out.println(f[i]);
    	}
    	
     }
}
/* Write a code to get the input in the given format and print the output in the given format.

Input Description:
A single line contains three float values separated by space.

Output Description:
Print the float value separated by line.

Sample Input :
2.3 4.5 7.8
Sample Output :
2.3
4.5
7.8*/