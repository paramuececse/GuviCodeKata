package Mathematics;
import java.util.Scanner;
public class M102 {

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
				System.out.println(j);
			}
		}
	}

}
/*Nishant is a short heighted person. He is standing facing N pillars of different heights with ith pillar having height hi. He tries to see all the possible pillars. He wants to know that how many buildings will he be able to see in the range.

Input Description:
First line contains input ‘n’ denoting size of array.Next line contains n space separated numbers

Output Description:
Print the maximum towers he can see

Sample Input :
5
11 5 9 6 7
Sample Output :
1*/