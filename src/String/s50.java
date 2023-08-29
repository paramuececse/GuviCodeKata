package String;
import java.util.*;
public class s50 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)!=s.charAt(j)){
					
					count++;
				}
				
			}}
			if(count==3)
				System.out.println(1);
			else
				System.out.println(0);
		
		
//System.out.println(count);
	}

}
/*You are given a string ‘s’. Your task is to find whether string is beautiful or not. A string is said to be beautiful whenever string is made up of only three characters. All the three characters must be distinct. Print true if string is beautiful and false when it is not beautiful

Input Description:
You are given a string

Output Description:
Print ‘1’ when string is beautiful and ‘0’ when it is not

Sample Input :
Aab
Sample Output :
1*/