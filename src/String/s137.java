package String;
import java.util.*;
public class s137 {
     public static void main(String[] args) {
    	 Scanner object=new Scanner(System.in);
        String string_input = object.nextLine();
        String s[] = string_input.split(" ");
        String temp = "";
        for (int i = s.length - 1; i > 0; i--) {
            temp =temp+ s[i] + " ";
            System.out.print(temp);
        }
        
        System.out.print(s[0]);
        
    }
}
