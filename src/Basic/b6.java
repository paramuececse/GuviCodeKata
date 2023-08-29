package Basic;
import java.util.Scanner;
public class b6 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);	
    int N=object.nextInt();
    int L=object.nextInt();
    int R=object.nextInt();
	if(L<=R && N!=0 || L==N||L==R ) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}

}
/*Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.
Sample Testcase :
INPUT
3
2 6
OUTPUT
yes*/