package arrayPackage;
import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        
        int n = object.nextInt(); 
        int k = object.nextInt(); 
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = object.nextInt();
        }
        int diff=0;
        for (int i = 0; i < n; i++) {
             diff = Math.abs(array[i] - array[i + 1]);
            if (diff > k) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.print(diff);
        
    }
}
/*You are given with an circular array .Your task is calculate the difference between two consecutive number. And if difference is greater than ‘k’, print 1 else print 0

Input Description:
You are given two numbers ‘n’, ’m’. Next line contains n space separated integers.

Output Description:
Print 1 if the difference is greater than ‘m’.

Sample Input :
5 15
50 65 85 98 35
Sample Output :
0 1 0 1 0*/