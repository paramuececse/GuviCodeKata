package String;
import java.util.*;
public class s11 {
	
	public static void main(String[] args) {
        String input = "I am john cena cena john";
        String result = removeAdjacentDuplicates(input);
        System.out.println(result); // Output: "I am"
    }

    public static String removeAdjacentDuplicates(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        // Initially, add the first word to the result
       // result.append(words[0]);
        
        // Loop through the remaining words to check for adjacent duplicates
        for (int i = 0; i < words.length-1; i++) {
        	for(int j=i+1;j< words.length; j++) {
            if (!words[i].equals(words[j])) {
                result.append(" ").append(words[i]);
            }
        }
        }
        return result.toString().trim();
    }
}


//	public static void main(String[] args) {
//		Scanner object=new Scanner(System.in);
//		String words=object.nextLine();
//		String[] spliting_words=words.split(" ");
//		StringBuilder sb=new StringBuilder();
//		sb.append(spliting_words[0]);
//		for(int i=1;i<spliting_words.length;i++) {
//			if(!spliting_words[i].equals(spliting_words[i-1])) {
//				
//			}
//		}
//
//	}
//
//}
