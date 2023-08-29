package arrayPackage;
import java.util.*;
import java.util.Arrays;
public class a4 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int array_size=object.nextInt();
		int[] array=new int[array_size];
		for(int i=0;i<array_size;i++) {
			array[i]=object.nextInt();	
			}
		//Arrays.sort(array);
		int j;
		for( j=array.length-1;j>0;j--) {
			//if(array[j]!=array[j+1]) {
				System.out.print(array[j]+" ");
			}
		//}
		System.out.print(array[j]);
   
	}

}
/*You are given an array. Your task is to sort the array in given manner. Print the elements in increasing order of the frequency. If frequency is same print smaller one first.

Input Description:
You are given a number ‘n’. Then in next line n space separated numbers.

Output Description:
Print the array as mentioned

Sample Input :
4
1 1 3 2
Sample Output :
2 3 1*/