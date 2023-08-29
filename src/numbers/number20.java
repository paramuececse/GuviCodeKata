package numbers;
import java.util.*;
public class number20 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
		int X=object.nextInt();
		int time=N*X;
		int waiting_time=time-5;
		System.out.println(waiting_time);

	}

}
/*In a garage the service man takes 10 minutes to service one car.If there are N cars in garage and X is number of minutes after which one person arrives,Calculate how much time last person has to wait in garage.(Print answer in minutes)

Input Description:
You are given Two numbers ‘N’ and ‘X’

Output Description:
Waiting time of last person

Sample Input :
4 5
Sample Output :
15*/