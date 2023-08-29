package Basic;
import java.util.Scanner;
public class b26 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int N=object.nextInt();
	int[] array=new int[N];
	for(int i=0;i<N;i++) {
		array[i]=object.nextInt();
	}
	int[] temp = new int[N];
	for(int j=0;j<N-1;j=j+2) {
		temp[j]=array[j];
		array[j]=array[j+1];
		array[j+1]=temp[j];
	}
	int k;
	for( k=0;k<N-1;k++) {
		System.out.print(array[k]+" ");
	}
	System.out.print(array[k]);
}
}
/*Given an array of N elements switch(swap) the element with the adjacent element and print the output.
Sample Testcase :
INPUT
5
3 2 1 2 3
OUTPUT
2 3 2 1 3*/