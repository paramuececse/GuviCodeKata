package Mathematics;


import java.util.Scanner;

public class M25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        

        printOddDigits(number);
    }

    public static void printOddDigits(int number) {
        boolean hasOddDigit = false;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
                hasOddDigit = true;
            }
            number /= 10;
        }

        if (!hasOddDigit) {
            System.out.println("-1");
        }
    }
}
