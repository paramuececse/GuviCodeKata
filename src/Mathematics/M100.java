package Mathematics;
import java.util.*;
public class M100 {

	public static void main(String[] args) {
     Scanner object=new Scanner(System.in);
     int n=object.nextInt();
     int[] array=new int[n];
     for(int i=0;i<n;i++) {
    	 array[i]=object.nextInt();
     }
     int max = array[0];
     for(int i=0;i<n;i++) {
    	 for(int j=i+1;j<n;j++) {
    		 if(array[i]<array[j]) {
    			max=array[j];
    			//min=array[j];
		}    	 
     }
	}
     for(int i=1;i<n;i++) {
    	 
    	 if(array[i]%max==0) {
    		 max=max*i;
    	 }
     }
     max++;
     System.out.println(max-1);
     }
	
	}


/*:You are given an array of ‘n’ numbers.your task is to print the lcm of ‘n’ numbers

Input Description:
An integer ‘n’ denoting the size of array.Next line contains ‘n’ space separated numbers

Output Description:
Print the lcm

Sample Input :
4
2 4 6 8
Sample Output :
24*/