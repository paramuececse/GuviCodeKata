package pattern;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int m=n;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
			for(int j=1;j<=m;j++) {
				 System.out.print(j);
				}
			}
			else if(i%2==0){
				for(int k=m;k>=1;k--)
					System.out.print(k);
			}
			m--;
			System.out.println();
			}
			
			}
		
	}


/*Write a code to generate a half pyramid number pattern.

Input Description:
Given an even integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the number half pyramid pattern with the size R.

Sample Input :
5
Sample Output :
12345
4321
123
21
1*/