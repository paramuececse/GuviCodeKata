package numbers;
import java.util.*;
public class n4 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int[] array=new int[n];
	for(int  i=0;i<n;i++) {
		array[i]=object.nextInt();
	}
	int sum=0;
	for(int j=0;j<n;j++) {
		sum=sum+array[j];
		
	}
	if(sum%2==0 &&sum%3==0&& sum%5==0) {
		System.out.println(1);
	}
	else {
		System.out.println(0);
	}
	}

}
/*you are given with array of numbers.you have to find whether array is beautiful or not. A beautiful array is an array whose sum of all numbers is divisible by 2, 3 and 5

Input Description:
You are given a number ‘n’ denoting the size of array.Next line contains n space separated numbers.

Output Description:
Print 1 if array is beautiful and 0 if it is not

Sample Input :
5
5 25 35 -5 30
Sample Output :
1*/