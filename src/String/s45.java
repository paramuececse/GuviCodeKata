package String;

import java.util.Scanner;

public class s45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();

        String second = scanner.nextLine();

        if (isSubstring(first, second)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    private static boolean isSubstring(String first, String second) {
        return first.contains(second);
    }
}