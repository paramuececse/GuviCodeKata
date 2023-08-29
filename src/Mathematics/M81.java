package Mathematics;
import java.util.*;
public class M81 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int sum=0;
		int i=0;
		while(n>0) {
			int remainder=n%10;
			//System.out.print(remainder+" ");
			
			//System.out.print(i+" ");
			int hexa=(int) Math.pow(16, i);
			
			sum=sum+(remainder*hexa);
			n=n/10;
			i++;
			
		}
           System.out.println(sum);
	}

}
/*Given a hexadecimal number convert it into decimal.
Sample Testcase :
INPUT
293
OUTPUT
659*/