package Mathematics;

import java.util.Scanner;

public class M28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        printSeries(n);
    }

    public static void printSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int term = i * i;
            System.out.print(term + " ");
        }
    }
}
