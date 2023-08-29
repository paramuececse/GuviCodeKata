package pattern;
import java.util.*;
public class p57 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int m=1;
		for(int i=0;i<a;i++) {
			
			for(int j=0;j<a;j++) {
				if(i==j || i==a-j-1) {
					System.out.print(m);
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			m++;
		}
	}

}
