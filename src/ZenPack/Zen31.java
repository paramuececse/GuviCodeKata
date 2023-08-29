package ZenPack;
import java.util.*;
public class Zen31 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
        	if(array[i]%2!=0) {
        	sum=sum+array[i];
        }
         
	}
        System.out.println(sum);
	}
}

/*Given a number n followed by n numbers add the odd number in an array

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the sum of odd numbers in an array

Sample Input :
6
5 7 4 4 6 8
Sample Output :
12*/