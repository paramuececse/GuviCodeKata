package String;
import java.util.*;
public class s41 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		String store="";
	    char c[]=new char[s.length()];
	    for(int i=0;i<s.length();i++) {
	    	c[i]=s.charAt(i);
	    }
	    int j=0;
	    int k=j+1;
	    int count=1;
	    ;
	    for( j=0;j<s.length()-1;j++) {
	    	for( k=j+1;k<=s.length()-1;k++) {
	    		if(c[j]==c[k]) {
	    			count++;
	    		}
	    	}
	    	
	    	
	    	//System.out.println(c[j]+"-------->"+count);
	    	if(count>=2) {
	    		
		    	store=store+c[j];
		    }
	    	
	    	count=1;
	    }
	   // System.out.println(store);
	  if(store.length()>=1) {
		for(int i=0;i<store.length()-1;i++) {
			System.out.print(store.charAt(i)+" ");
		}
	    System.out.print(store.charAt(store.length()-1));
	  }
	  else {
		  System.out.println("-1");
	  }
          
	}

}
/*You are given a string ‘s’.Print all the duplicate characters of string.

Input Description:
String ‘s; is given

Output Description:
Print only duplicate character and -1 if no character is duplicate.

Sample Input :
abcddee
Sample Output :
d e*/