package Mathematics;
import java.util.Scanner;
public class M29 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int min=array[0];
        for(int j=0;j<n;j++) {
        	if(array[j]<min) {
        		min=array[j];
        	}
        }
System.out.println(min);
	}

}
/*Pk finds it difficult to judge the minimum element in the list of elements given to him. Your task is to develop the algorithm in order to find the minimum element.

 

Note:Don’t use sorting
 

Input Description:
You are given ‘n’ number of elements. Next line contains n space separated numbers.

Output Description:
Print the minimum element

Sample Input :
5
3 4 9 1 6
Sample Output :
1*/
