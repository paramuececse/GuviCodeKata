package Mathematics;
import java.util.Scanner;
public class M38 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		 int a=object.nextInt();
		 int b=object.nextInt();
		 int c=object.nextInt();
		 int v;
		 v=a+(c-1)*b;
          System.out.println(v);
	}

}
/*Given 3 numbers A,B,C find the sum of Arithmetic Series with a=A, d=B and n=C
Sample Testcase :
INPUT
1 1 2
OUTPUT
3*/
