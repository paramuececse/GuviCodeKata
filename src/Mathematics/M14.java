package Mathematics;
import java.util.Scanner;
public class M14 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		char[] ca=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ca[i]=s.charAt(i);
		}
		System.out.println(ca);
		int sum=0;

		for(int j=0;j<s.length();j++) {
			if(ca[j]==0||ca[j]==1||ca[j]==2||ca[j]==3||ca[j]==4||
					ca[j]==5||ca[j]==6||ca[j]==7||ca[j]==8||ca[j]==9){
				System.out.println(ca[j]);
			}
		}
		
		
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