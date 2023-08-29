package Mathematics;
import java.util.*;
public class M110 {

	
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int L=object.nextInt();
		int R=object.nextInt();
		if(method(L,R)>=1) {
			//System.out.println(count);
		}
	}
		private static int method(int L, int R) {
			int count=0;
			for(int i=L;i<=R;i++) {
				if(i*i<=R) {
					count++;
					
				}
			}
            System.out.println();
	       return count;
		
	}
	

}
/*Given a range (i.e) two numbers L and R count the number of perfect squares within the range (inclusive of L and R).If no perfect square exists within the range print '-1'.
Input Size : L <= R <= 100000(complexity O(n))
Sample Testcase :
INPUT
2 10
OUTPUT
2*/