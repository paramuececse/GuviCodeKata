package Mathematics;
import java.util.Scanner;
public class M94 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[5];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        for(int j=0;j<n;j++) {
        	if(array[j]<array[j+1] &&array[j+1]>array[j+2]) {
        		System.out.println("yes");
        	}
        }
	}

}
/*Given an array N, check if the values are alternating between increasing and decreasing.
Input Size : N <= 100000
Sample Testcase :
INPUT
5
12 14 3 7 4
OUTPUT
yes*/