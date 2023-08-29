package Mathematics;
import java.util.Scanner;
public class M1 {
public static void main(String[] args) {
	Scanner object =new Scanner(System.in);
	int n=object.nextInt();
	int sum=0;
	if(n%2==0) {
		sum=n*2000;
	}
	else {
		sum=1000+n*2000;
	}
	System.out.println(sum);
}
}

/*A person saves his monthly saving according to given schema. He saves same amount of money which is equal to the money saved in immediate previous two months. Assume, initially he saved 1000 rupees and in first month he saved another 1000. Your task is to tell how much he had totally saved at the end of ‘n’ months

Input Description:
You will be given a number ‘n’->No. of months

Output Description:
Print the total savings at the end of ‘n’ months

Sample Input :
1
Sample Output :
2000*/