package Mathematics;
import java.util.Scanner;
public class M31 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        int sum=0,sum1=0;
        for(int i=0;i<3;i++) {
        	sum=sum+array[i];
        }
        //System.out.println(sum);
        int count=0;
        for(int i=array.length-1;i>0;i--) {
        		
        	sum1=sum1+array[i];
        	count++;
        	if(count==3) {
        		break;
        	}
        }
       // System.out.println(sum1);
        if(sum==sum1) {
        	System.out.println(1);
        }
        else {
        	System.out.println(0);
        }
	}

}
/*You are given given task is to print whether array is ‘majestic’ or not.A ‘majsetic’ array is an array whose sum of first three number is equal to last three number.

Input Description:
You are given a number ‘n’,Next line contains ‘n’ space separated

Output Description:
Print 1 if array is majestic and 0 if it is not

Sample Input :
7
1 2 3 4 6 0 0
Sample Output :
1*/
