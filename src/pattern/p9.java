package pattern;
import java.util.Scanner;
public class p9 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			if(j<i)
			System.out.print(" ");
		}
		System.out.println();
	}

	}

}
