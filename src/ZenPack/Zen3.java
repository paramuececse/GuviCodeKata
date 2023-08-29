package ZenPack;
import java.util.*;
public class Zen3 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
        	sum=sum+array[i];
        }
        if(sum%2==0) {
        	System.out.println("even");
        }else {
        	System.out.println("odd");
        }
	}

}
/*Given a number n followed by n numbers Find the sum of the elements in an array and print sum of number is odd or even

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
print sum of number is odd or even

Sample Input :
3
5 7 4
Sample Output :
even*/