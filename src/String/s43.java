package String;
import java.util.*;
public class s43 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	String s=object.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
			System.out.print(s.charAt(i));
		}
		
		else if(s.charAt(i)==' ' && count==0 ) {
			count++;
			System.out.print(s.charAt(i));
		}
	}
}
}
