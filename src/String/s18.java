package String;
import java.util.*;
public class s18 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		 String s=object.nextLine();
        String[] a=s.split(" ");
        //String temp="";
       
//for(int i=0;i<a.length;i++) {
//	   a[i]=temp+a[i];
//}
//System.out.println(a[3]);
String temp1 = "";

       for(int i=0;i<a.length;i++) {
        	if(a[i].equals("the")||a[i].equals("The") 
        			||a[i].equals("an")||a[i].equals("AN")
        			||a[i].equals("a")||a[i].equals("A")) {
        		temp1=(a[i+1]);
        		
        		System.out.print(temp1+" ");
        	}
        	
        }
//       String[] temp2 =new  String[temp1.length()-2];
//       for(int k=0;k<)
// System.out.println(temp1.length());
	}

}
/*You are given a paragraph.Your task is to print the words that come just after articles.

Input Description:
You are given a string ‘s’

Output Description:
print the words that come just after articles and -1 if there are no articles

Sample Input :
The sun rises in the east

Sample Output :
sun east*/