package String;
import java.util.*;
public class s8 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.nextLine();
		int a[]=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=Character.getNumericValue(s.charAt(i));
		}
		//System.out.println(a);
		int sum=0;
		for(int j=0;j<s.length();j++) {
			if(a[j]>=0 &&a[j]<=9) {
				sum=sum+a[j];
			}
		}
System.out.println(sum);
	}

}
/*In XYZ country there is rule that car’s engine no. depends upon car’ number plate. Engine no is sum of all the integers present on car’s Number plate.The issuing authority has hired you in order to provide engine no. to the cars.Your task is to develop an algorithm which takes input as in form of string(Number plate) and gives back

Engine number.

Input Description:
You are given a string ’s’

Output Description:
Print the engine number

Sample Input :
HR05-AA-2669
Sample Output :
28*/