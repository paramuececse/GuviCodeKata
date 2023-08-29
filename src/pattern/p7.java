package pattern;

import java.util.Scanner;
public class p7 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<j||i==j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}