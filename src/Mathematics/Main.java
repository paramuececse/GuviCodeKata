package Mathematics;

import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
        int[] arr = new int[7];
         
         for (int i = 0; i < arr.length; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}

		
		for (int i = 0; i <arr.length; i++) {
		
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
