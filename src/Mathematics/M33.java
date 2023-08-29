package Mathematics;
import java.util.Scanner;
public class M33 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
     int n=object.nextInt();
     int a,b;
     a=(n/10)*10;
     b=a+10;
    int c= n-a>n-b?b:a;
    System.out.println(c);
	}

}
/*Given a number N, find the nearest greater multiple of 10.
Input Size : N <= 10000
Sample Testcase :
INPUT
3
OUTPUT
10*/