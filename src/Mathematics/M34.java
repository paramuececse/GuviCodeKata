package Mathematics;
import java.util.Scanner;
public class M34 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		int sum=0;
		for(int i=array.length-1;i>=n-3;i--) {
			sum=sum+array[i];
			
		}
		//System.out.println(sum);
		int[] array1=new int[n];
		int i;
		for(i=0;i<array.length;i++) {
			array1[i]=array[i]-sum;
			//System.out.print(array1[i]+" ");
		}
		for(i=0;i<array.length-1;i++) {
			
			System.out.print(array1[i]+" ");
		}
		
		System.out.print(array1[i]);
	}
	
       
}
/*In a world cup tournament,no of goals scored by each team is given to you. Your task is to calculate net goal rate of each team.

Net goal rate of team is calculated

 

No of goals(team)- sum of(no of goals by last 3 teams)

Input Description:
You are given a number ‘n’.Next line contains n space separated numbers.

Output Description:
Print the net goal rate of each team

Sample Input :
5
95 85 75 12 11
Sample Output :
-3 -13 -23 -86 -87*/