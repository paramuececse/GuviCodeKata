package String;
import java.util.*;
public class s3 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String s=object.next();
		LinkedHashSet<Character> uniquevalue=new LinkedHashSet<>();
		LinkedHashSet<Character> duplicatevalue=new LinkedHashSet<>();
		for(char c:s.toCharArray()) {
			if(!uniquevalue.add(c)) {
				duplicatevalue.add(c);
			}
		}
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(!duplicatevalue.contains(c)) {
				sb.append(c);
			}
		}
		
		System.out.print(sb);
		
	}}
//		HashMap<Character, Integer> hm=new HashMap<>();
//		for(int i=0;i<s.length();i++) {
//			if(hm.containsKey(s.charAt(i))) {
//				int count=hm.get(s.charAt(i));
//			hm.put(s.charAt(i), count++);
//			}
//			else {
//				hm.put(s.charAt(i), 1);
//			}
//		}
//		
//		//System.out.println(hm);
//		hm.forEach((key,value)->{
//			if(value==1 && value<=1) {
//				System.out.print(key);
//			}
//		});		
//		}
//		
	//}

/*Rahul is given a task to manipulate a string, He hired you as a developer your task is to delete all the repeating characters and print the result left.

Input Description:
You are given a string ‘s’

Output Description:
Print the remaining string

Sample Input :
mississipie
Sample Output :
mpe*/