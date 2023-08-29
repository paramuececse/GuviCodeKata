package pattern;
import java.util.Scanner;
public class p42 {

	public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int m=n+n-1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<n;j++) {
			if(i>j)
				System.out.print(" ");
		}
		for(int j=1;j<=m;j++) {
			System.out.print(m);
		}m=m-2;
		System.out.println();
	}
	}

}
