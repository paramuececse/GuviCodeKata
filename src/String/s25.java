package String;
import java.util.Scanner;
public class s25 {
	public static void main(String[] args){
			Scanner object = new Scanner(System.in);
			String s1=object.nextLine();
			String s2=object.nextLine();
			boolean val = s1.contains(s2);
			if(val)
				System.out.println(1);
			else 
				System.out.println(-1);
		}
	}

