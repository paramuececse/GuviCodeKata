package Mathematics;
import java.util.*;
public class M44 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
//		int L=object.nextInt();
//		int R=object.nextInt();
		int j,i;
		int flag=1;
		for( i=2;i<=10;++i) {
			for( j=2;j<=i/2;++j) {
				if(i%j==0) {
					flag=0;
					break;
				}
				
			}
			int count=1;
			if(flag==1) {
				count++;
				//System.out.print(i+" ");
			}
			System.out.print(count);
		}
		
		

	}

}
/*Given a range of 2 numbers (i.e) L and R count the number of prime numbers in the range (inclusive of L and R ).
Input Size : L <= R <= 100000(complexity O(n) read about Sieve of Eratosthenes)
Sample Testcase :
INPUT
2 5
OUTPUT
3*/