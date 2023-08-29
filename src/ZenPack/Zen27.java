package ZenPack;
import java.util.*;
public class Zen27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int specialCharacterCount = countSpecialCharacters(inputString);

        if (specialCharacterCount == 0) {
            System.out.println("-1");
        } else {
            System.out.println("Number of special characters: " + specialCharacterCount);
        }
    }

    public static int countSpecialCharacters(String str) {
        int specialCharacterCount = 0;
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialCharacterCount++;
            }
        }
        return specialCharacterCount;
    }
}
/*Given a string find the number of special characters if their no special characters print -1

Input Description:
Given a string

Output Description:
Print number of special characters or -1

Sample Input :
Guvi Geek
Sample Output :
-1*/