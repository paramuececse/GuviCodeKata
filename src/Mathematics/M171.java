package Mathematics;
import java.util.*;
public class M171 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		while(true) {
			int input=object.nextInt();
			if(input==0)
				break; 
			else
				list.add(input);
		}
		System.out.println(list);
	}

}
/*Write a program to get a list of integers as input and find the LCM of the values without using GCD

Input Description:
First line contains an integer N, number of values. Second line contains N space separated values.

Output Description:
Print the LCM of the values.

Sample Input :
1 2 3 4 5
Sample Output :
60*/