package String;
import java.util.*;
public class s19 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.nextLine();
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a'&&s.charAt(i)<='z'||
				s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			System.out.print(s.charAt(i));
		}
	}
	int[] a=new int[s.length()];
	for(int i=0;i<s.length();i++) {
		a[i]=Character.getNumericValue(s.charAt(i));
	}
	
	int sum=0;
	 
     for(int i=0;i<s.length();i++) {
	 if(a[i]>=0 &&a[i]<=9){
		sum=sum+a[i];
	}
}
      System.out.print(sum);
	}

}
/*You are given a string ‘s’.Your task is to print the string in the order they are present and then sum of digits.

Input Description:
You are given a string ‘s’.

Output Description:
Print the string and then at last sum of all the digits

Sample Input :
AC30BD40
Sample Output :
ACBD7*/