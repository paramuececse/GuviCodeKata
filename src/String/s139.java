package String;
import java.util.*;
public class s139 {

	public static void main(String[] args) {
		 Scanner object=new Scanner(System.in);
	      String string_input = object.nextLine();
	      
	    System.out.println(method(string_input));
	      
	}
	public static int method(String string_input) {
		int count=0;
	      for(int i=0;i<string_input.length()-1;i++) {
	    	  if(string_input.charAt(i)!=string_input.charAt(i+1)
	    			  &&string_input.charAt(i)==string_input.charAt(i+2)) {
	    		  count++;
	    		 
	    	  }
	    	  System.out.println(count);
	      }
            return 0; 
	}


}
/*Given a string S of length N, find the length of the largest alternating 'ab' subarray.
Input Size : 1 <= N <= 100000
Sample Testcases :
INPUT
	ababababa
OUTPUT
9*/