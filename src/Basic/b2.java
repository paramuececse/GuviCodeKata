package Basic;
import java.util.Scanner;
public class b2 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int[] array=new int[10];
	for(int i=0;i<array.length;i++) {
		array[i]=object.nextInt();
	}
	int min=1;
	for(int j=0;j<array.length;j++) {
		if(array[j]<min) {
			min=array[j];
			
		}
	}
	System.out.println(min);
}
}
/*Find the minimum among 10 numbers.
Sample Testcase :
INPUT
5 4 3 2 1 7 6 10 8 9
OUTPUT
1*/