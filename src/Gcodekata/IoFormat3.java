package Gcodekata;

import java.util.Scanner;

public class IoFormat3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	     int arr_size=sc.nextInt();
         int[] arr = new int[arr_size];
         
         int k=sc.nextInt();
         
         for (int i = 0; i < arr.length; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			      }
		        }
        
         System.out.print(arr_size+" ");
         System.out.println(k);
		
		for (int i = 0; i <arr.length-1; i++) {
		
			System.out.print(arr[i] + " ");
		}
			System.out.print(arr[arr.length-1]);
		sc.close();
	}
}

