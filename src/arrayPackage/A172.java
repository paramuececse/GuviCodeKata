package arrayPackage;
import java.util.*;
public class A172 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int[] array =new int [N];

		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		int i;
		for( i=0;i<array.length-1;i=i+2) {
			if(array[i]%2==0 && i%2==0) {
			System.out.print(array[i]+" ");
		}else {
			System.out.print(array[i]+" ");
		}
		}
		System.out.print(array[i]);
	}

}
/*Given a number N followed by N numbers. Print the even numbers which are present in odd positions and odd numbers which are present in even positions(0 indexing)If no element is found print '-1'.
Input Size : 1 <= N <= 100000
Sample Testcases :
INPUT
7
1 2 3 4 5 6 7
OUTPUT
1 2 3 4 5 6 7*/