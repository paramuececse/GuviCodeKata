package ZenPack;
import java.util.*;
public class Zen33 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int n=object.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
		array[i]=object.nextInt();
	}
	int maximum=0;
        for(int j=0;j<n;j++) {
        	if(array[j]>maximum) {
        		maximum=array[j];
        	}
        }
        int secondmaximum=0;
        for(int j=0;j<n;j++) {
        	if(array[j]>secondmaximum && array[j]!=maximum) {
        		secondmaximum=array[j];
        	}
        }
        System.out.print(secondmaximum);
	}

}
/* Given a number n followed by n numbers Print the 2nd  largest number in an array

Input Description:
0<n<100 Given a number n Followed by n number in next line

Output Description:
Print the second largest number in an array

Sample Input :
6
5 7 4 4 6 8
Sample Output :
7*/