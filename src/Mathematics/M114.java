package Mathematics;
import java.util.*;
public class M114 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int L=object.nextInt();
		int R=object.nextInt();
		int max;
		max = (L > R) ? L : R;

	    while (R>0) {
	        if ((max % L == 0) && (max % R == 0)) {
	           System.out.print( max);
	            break;
	        }
	       ++max;
	    }
	  
	}

	}


/*Given two numbers L,R print the smallest number which is divisible by both L and R.
Input Size : 1 <= L,R <= 100000
Sample Testcase :
INPUT
10 130
OUTPUT
130*/