package Mathematics;
import java.util.Scanner;
public class M43 {

	public static void main(String[] args) {
	 Scanner object=new Scanner(System.in);	
     int n=object.nextInt();
     int flag=1;
     for(int i=2;i<=n/2;i++) {
    	 if(n%i==0) {
    		 flag=0;
    	 }
     }
     if(flag==1) {
    	 System.out.println("yes");
     }
     else {
    	 System.out.println("no");
     }
	}

}
/*Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.
Sample Testcase :
INPUT
123
OUTPUT
no*/