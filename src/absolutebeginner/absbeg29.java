package absolutebeginner;
import java.util.Arrays;
import java.util.Scanner;
public class absbeg29 {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String n=object.next();
		int[] array=new int[n.length()];
		String emptyodd = "";
		String emptyeven = "";
		for(int i=0;i<n.length();i++) {
			array[i]=(int)Character.getNumericValue(n.charAt(i));
		}
		
		for(int i=0;i<n.length();i++) {
			if(array[i]%2!=0) {
				emptyodd=emptyodd+array[i];
				
			}
			else {
				emptyeven=emptyeven+array[i];
			}
		}
		char emptyoddsort[]=emptyodd.toCharArray();
		Arrays.sort(emptyoddsort);
		//System.out.println(emptyoddsort);
		char emptyevensort[]=emptyeven.toCharArray();
		Arrays.sort(emptyevensort);
		
		int j;
		for( j=0;j<emptyeven.length()-1;j++) {
			System.out.print(emptyevensort[j]+" ");
		}
		System.out.print(emptyevensort[j]);
		System.out.println();
		
		int i;
		for( i=0;i<emptyodd.length()-1;i++) {
			System.out.print(emptyoddsort[i]+" ");
		}
		System.out.print(emptyoddsort[i]);
	
}

	}

/*Write a code get an integer number as input and print the odd and even digits of the number separately.

Input Description:
A single line containing an integer.

Output Description:
Print the even and odd integers of the integer in a separate line.

Sample Input :
1234
Sample Output :
2 4
1 3*/