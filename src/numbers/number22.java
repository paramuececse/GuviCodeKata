package numbers;
import java.util.*;
public class number22 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		
		
			System.out.println(method(n));
		
	}
		public static int method(int n) {
			int fact=1,sum=0;
			while(n>0) {
				int remainder;
				remainder=n%10;
				//System.out.println(remainder);
				for(int i=1;i<=remainder;i++) {
					fact=fact*i;
				}
				sum=sum+fact;
				//System.out.println(sum);
				n=n/10;
				fact=1;
			}
			return sum;
		}
	}
		
		
