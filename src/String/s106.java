package String;
import java.util.*;
public class s106 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		char a=object.next().charAt(0);
		char b=object.next().charAt(0);
		//char S=object.next().charAt(0);
        if(a=='R'&& b=='P') {
        	System.out.print('P');
        }
        else if(a=='P'&& b=='S') {
        	System.out.print('P');
        }
        else if(a=='P'&& b=='P'||a=='S'&& b=='S'||a=='R'&& b=='R') {
        	System.out.print('D');
        }
        else  {
        	System.out.print('R');
        }
	}

}
/*Let P represent Paper, R represent Rock and S represent Scissors. Given 2 out of the 3 determine which one wins. If its a draw print 'D'.
Sample Testcase :
INPUT
R P
OUTPUT
P*/