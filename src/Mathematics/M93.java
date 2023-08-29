package Mathematics;
import java.util.*;
public class M93 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);	
	int n=object.nextInt();
	int k=object.nextInt();
	int possible=k/2;
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
		array[i]=object.nextInt();
	}
	int count=0,sum=0;
    for(int j=0;j<n;j++) {
    	if(array[j]<possible) {
    		sum=sum+array[j];
    		if(sum<k)
    		count++;
    	}
    }
    System.out.println(count);
	}

}
/*Assume you are john. John has one younger sister ‘jenny’. He wants to gift her some toys. He has a price list of toys and he has some amount on hand. Your task is to tell him how many toys john will be able to buy for her sister

Input Description:
First line contains two integer ‘n’ and ‘k’ ,n denotes the number of toys and k denotes total money he has.Next line contains n space separated integers denoting price of each toy

Output Description:
Print the max number of toys he can buy.

Sample Input :
7 50
1 12 5 111 200 1000 10
Sample Output :
4*/