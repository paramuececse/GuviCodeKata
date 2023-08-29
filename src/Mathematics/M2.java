package Mathematics;
import java.util.Scanner;
public class M2 {
public static void main(String[] args) {
	Scanner object =new Scanner(System.in);
	int n=object.nextInt();
	String temp=Integer.toString(n);
	int digits[] = new int[temp.length()];
   
	for(int i=0;i<temp.length();i++) {
		digits[i]=Character.getNumericValue(temp.charAt(i));
		//System.out.print(digits[i]);
	}
	int a=digits[0];
	int count=1;
	
	for(int i=0;i<temp.length();i++) {
		if(digits[i]!=a) {
			count++;
			break;
		}
		
	}
	
	System.out.println(count);
	if(count==2) {
		System.out.println("Saturated");
	}
	else {
		System.out.println("UnSaturated");
	}
	
}
}
/*You are provided with a number ’n’. Your task is to tell whether that number is saturated. A saturated number is a number which is made by exactly two digits.

Input Description:
You are given with a number n.

Output Description:
Print Saturated if it is saturated else it is Unsaturated

Sample Input :
121
Sample Output :
Saturated*/
