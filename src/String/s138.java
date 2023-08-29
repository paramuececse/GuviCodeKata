package String;
import java.util.*;
public class s138 {
     public static void main(String[] args) {
    	 Scanner object=new Scanner(System.in);
        String string_input = object.nextLine();
        String s[] = string_input.split(" ");
        String temp = "";
        for (int i = 0; i < s.length-1; i++) {
        	
            temp = s[i] + " ";
            System.out.print(temp);
        }
        
        System.out.print(s[s.length-1]);
        
    }
}
/*Given a sequence of strings remove extra spaces in the string(there can be atmost one space between 2 strings).
Input Size : 1<= N <= 100000
Sample Testcases :
INPUT
aa abba abba
OUTPUT
aa abba abba*/