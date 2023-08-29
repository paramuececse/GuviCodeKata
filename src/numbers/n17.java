package numbers;
import java.util.*;
public class n17 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int i,j = 0;
        for( i=0;i<n-1;i++) {
        	//for( j=i+1;j<n-1;j++) {
        		if(array[i]==array[i+1]) {
        			System.out.println(array[i]);
        			break;
        			
        		}
        		
        	//}
        	 
        }
       
	}

}
/*You are given an array of digits. Your task is to print the digit with maximum frequency.

Input Description:
You are given length of array ’n’,next line contains n space separated numbers.

Output Description:
Print the number with maximum frequency. If two number have equal freqency prin the number that comes first

Sample Input :
7
1 2 3 4 4 4 5
Sample Output :
4*/