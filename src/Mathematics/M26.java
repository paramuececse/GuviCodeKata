package Mathematics;
import java.util.*;
public class M26 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
	     long n=object.nextLong();
	     String s=Long.toString(n);
	     int[] array=new int[s.length()];
	     for(int i=0;i<s.length();i++) {
	    	 array[i]=Character.getNumericValue(s.charAt(i));
	    	 //System.out.print(array[i]);
	     }
	     int count=1;
	     for(int i=0;i<array.length-1;i++) {
	    	 if(array[i]==array[i+1]&&array[i]==1&&array[i+1]==1) {
	    		 count++;
	    		 //continue;
	    		 
	    	 }
	    	 
	    	
	     }
	     if(count>2) {
         System.out.println(count); 
	}
	     else {
	    	 System.out.println(-1);
	     }
	}

}
/*You are given a large number made of only 0’s and 1’s.Your task is to find the max no of consecutive 1’s. If there are no 1’s print -1

Input Description:
A large number ‘n’

Output Description:
Print the max no of consecutive 1 in the number

Sample Input :
101011111
Sample Output :
5*/