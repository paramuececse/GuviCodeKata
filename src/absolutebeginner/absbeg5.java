package absolutebeginner;
import java.util.Scanner;
public class absbeg5 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int a=object.nextInt();
	int b=object.nextInt();
	int c=object.nextInt();
	if(a>b && a>c) {
		System.out.println(a);
	}
	else if(b>c && b>a) {
		System.out.println(b);
	}
	else {
		System.out.println(c);
	}
}
}
/*You are given three numbers A, B & C. Print the largest amongst these three numbers.

Input Description:
Three numbers are provided to you.

Output Description:
Find and print the largest among the three

Sample Input :
1
2
3
Sample Output :
3*/