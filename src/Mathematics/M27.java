package Mathematics;
import java.util.*;
public class M27 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
			}
		//System.out.println("length-->"+array.length);
		
		int t=object.nextInt();
		int [] array1=new int[t];
		
		for(int j=0;j<t;j++) {
			array1[j]=object.nextInt();
			
			//System.out.print(array1[j]+",");
		}
		//System.out.println("array1 le-->"+array1.length);
		
		int x,y = 0;
		
		for(x=0;x<t-1;x++) {
			   int count=0;
			for(y=0;y<n;y++) {
				if(array1[x]==array[y]) {
					count++;
				}
				
			}
			//System.out.print(count+" ");
			
             if(count >0) {
            	 System.out.print(count+" ");
             }
             else {
            	 System.out.print("Not Present"+" ");
             }
             
             
		}
		
			   int count1=0;
			for(y=0;y<n;y++) {
				if(array1[t-1]==array[y]) {
					count1++;
				}
				
			}
			if(count1 >0) {
           	 System.out.print(count1);
            }
            else {
           	 System.out.print("Not Present");
            }
            
            
		}
		
	}


/*Shreya is a brilliant girl. She likes to memorize the numbers. These numbers will be shown to her. As an examiner develop an algorithm to test her memory.

 

CONSTRAINTS

1<=Y,N,T<=1000

Input Description:
First line contains no. of test cases(Y). Next line contains a number N. Next line contains n space separated numbers Next line contains a number T denoting the number of questions asked from you regarding the given array. Next line contains T space separated numbers.

Output Description:
Print the occurrence of each number if present else “NOT PRESENT”

Sample Input :
10
1 1 1 2 2 2 3 8 9 7
5
1 2 3 0 5
Sample Output :
3 3 1 Not Present Not Present*/