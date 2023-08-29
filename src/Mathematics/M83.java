package Mathematics;
import java.util.*;
public class M83 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int K=object.nextInt();
		if(method(N, K)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

	public static boolean method(int N,int K) {
		for(int i=0;i<K;i++) {
			if(N==Math.pow(K, i)) {
				//System.out.println("yes");
				return true;
			}
	}
		return false;
		
	}
}
/*Given 2 numbers N and K.check if N is a power of K.Print 'yes' if it is a power of k otherwise print 'no'.
Sample Testcase :
INPUT
64 8
OUTPUT
yes*/