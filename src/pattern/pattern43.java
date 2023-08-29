package pattern;
import java.util.*;
public class pattern43 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		//int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				int a=1;
			while(a<=10)
				if(a%2!=0)
			        System.out.print(a);
				else if(a%2==0)
					System.out.print(a);
			a++;
			}
			System.out.println();
			}
	}

}
/*Write a code to generate a half pyramid pattern using numbers.

Input Description:
Given an integer R indicates number of rows.

Where 1<=R<=100.

Output Description:
Print the number half pyramid pattern with the size R.

Sample Input :
5
Sample Output :
1
24
135
2468
13579*/