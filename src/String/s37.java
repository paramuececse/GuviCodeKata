package String;

import java.util.Scanner;

public class s37 {
    public static void main(String[] args) {
   Scanner object=new Scanner(System.in);
   String s1=object.nextLine();
   String s2=object.nextLine();
  String sb= method(s1,s2);
   if(sb.isEmpty()) {
	   System.out.println("-1");
   }
   else {
	   System.out.println(sb);
   }
}

	public static String method(String s1, String s2) {
		StringBuilder sb=new StringBuilder();
		for(char ch:s1.toCharArray()) {
			if(s2.indexOf(ch)==-1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}