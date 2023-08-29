package Basic;
import java.util.*;
public class B29 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
			}
		int min=array[0],index1=0;
		for(int j=0;j<n;j++) {
			if(array[j]<min) {
				min=array[j];
				index1=j;
			}
		}
		int max=0,index=0;
		for(int j=0;j<n;j++) {
			if(array[j]>max) {
				max=array[j];
				index=j;
			}
		}
		//System.out.print(min);
		System.out.print(index1+1);
		System.out.print(" ");
		System.out.print(index+1);
		//System.out.println(max);

	}

}
/*Given a number N followed by N numbers.Find the smallest number and largest number and print both the indices(1 based indexing).
Input Size : N <= 100000
Sample Testcase :
INPUT
5
1 2 3 4 5
OUTPUT
1 5*/