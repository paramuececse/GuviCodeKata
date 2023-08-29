package Mathmetics;
import java.util.*;

public class M8 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		
        int[] array=new int[n];
        
        int m=object.nextInt();
        for(int i=0;i<n;i++) {
        	array[i]=object.nextInt();
        }
        
        for(int j=n-1;j>0;j--) {
        	if(array[j]%m==0) {
        		System.out.print(1+" ");
        	}
        	else {
        		System.out.print(0+" ");
        	}
        	
        }
        System.out.print(0);
     
	}}