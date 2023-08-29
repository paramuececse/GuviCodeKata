package pattern;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j)
				System.out.print("*");
				else
					System.out.print("b");
			}
			for(int j=n-1;j>=1;j--) {
				if(i<=j)
				System.out.print("*");
				else
					System.out.print("b");
			}
		
			
			System.out.println();
		}
	}

}
