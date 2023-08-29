package Mathematics;
import java.util.Scanner;
public class M95 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		String s=Integer.toString(n);
		int[] array=new int[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++) {
			array[i]=Character.getNumericValue(s.charAt(i));
		}
		for(int j=0;j<s.length()-1;j++) {
			if(array[j]==array[j+1]) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		}

	}


/*Given a number N,check whether it has repeating digits in it.print 'yes' if it has repeating digits otherwise print 'no'.
Sample Testcase :
INPUT
11234
OUTPUT
yes*/