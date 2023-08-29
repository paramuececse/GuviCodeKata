package pattern;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j<i) {
					System.out.print((char)(65+j)+" ");
				}
				else {
					System.out.print((char)(65+j));
				}
			}
			 System.out.println();
			 
		}
//System.out.println((char)65);
	}

}
