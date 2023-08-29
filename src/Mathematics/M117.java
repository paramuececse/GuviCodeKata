package Mathematics;
import java.util.*;
public class M117 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=object.nextInt();
		int sum=0;
		for(int i=n;i<=m;i++) {
			if(i%2!=0)
			sum=sum+i;
		}
        System.out.println(sum);
	}

}
/*Given a range[L,R], print the sum of all the odd numbers within the range(inclusive of L and R).
Sample Testcase:
INPUT
5 10
OUTPUT
21*/