package pattern;
import java.util.Scanner;
public class p55 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print((char)(j+64));
			}
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
