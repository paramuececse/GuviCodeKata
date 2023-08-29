package pattern;
import java.util.*;
public class pattern51 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		for(int i=n;i>=1;i--) {
		
			for(int j=n;j>=1;j--) {
				if(i>=j)
				System.out.print((char)(i+64));
				else
					System.out.print(" ");
		}
			System.out.println();

	}

}}
