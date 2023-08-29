package Basic;
import java.util.*;
public class b15 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int M=object.nextInt();
		int gcd=0;
		int gcd1=0;
   for(int i=1;i<=N&&i<=M;i++) {
   	if(N%i==0&& M%i==0) {
    		gcd=i;
		
    	}
     }
   System.out.println(gcd);
//     if (N>0&& M<0) {
// 		gcd1=1;
//      	System.out.println(gcd1);
//      }
//      else {
//     	 gcd1=-1;
//      	System.out.println(gcd1);
//      }
	}
	}

/*Given 2 numbers N,M find the GCD of N and M.If it cannot be found for given number(s) then print -1
Sample Testcase :
INPUT
10 5
OUTPUT
5*/