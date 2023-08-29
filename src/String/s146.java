package String;
import java.util.*;
public class s146 {
    public static void main(String[] args) {
    	
    		Scanner object=new Scanner(System.in);
    		String s1=object.next();
        	String s2=object.next();
        	String s3="";
        	int count=0;
        	int l1=s1.length();
        	int l2=s2.length();
        	
        	char[] ch1=s1.toCharArray();
        	char[] ch2=s2.toCharArray();
        	int b;
        	b=(l1<l2)?l1:l2;
        	for(int i=0;i<b;i++) {
        		if(ch1[i]==ch2[i]) {
        			s3=s3+(ch1[i]);
        			count++;
        		}
        	}
        	//System.out.println(s3);
        	 String s4= count > 0 ? s3 : "-1";
        	
        System.out.println(s4);
		
	}}
		