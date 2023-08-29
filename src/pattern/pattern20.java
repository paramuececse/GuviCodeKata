package pattern;
import java.util.*;
public class pattern20 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i<j)
					System.out.print("*"+" ");
				
			}
			for(int k=1;k<=i;k++) {
				if(i==k)
					System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
