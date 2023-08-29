package arrayPackage;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
	

	public class A42 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
int N = scanner.nextInt();
int[] rolls = new int[N];

for (int i = 0; i < N; i++) {
	            rolls[i] = scanner.nextInt();
	        }

	        int findsinglevalue = findSinglyOccurringNumber(rolls);
	        System.out.println( findsinglevalue);
	    }

	    public static int findSinglyOccurringNumber(int[] arr) {
	        Map<Integer, Integer> countMap = new HashMap<>();

	        for (int num : arr) {
	         countMap.put(num, countMap.getOrDefault(num, 0)+1);
	        // System.out.println(num+"--->"+countMap.getOrDefault(num, 0));
	         
	        }
//            Set<Integer> a=countMap.keySet();
//            System.out.println(a);
           
	        for (int Countnum : countMap.keySet()) {
	        	 //System.out.print(countMap.get(num)+" ");
	            if (countMap.get(Countnum) == 1) {
	            	
	                return Countnum;
	            }
	        }

	        return -1; 
	    }
	}

/*Prakash is bored and wants to spends his time. He starts rolling a die and observes the value that is shown. He rolls the dice N times and observes that just one number appears distinctly, all the others get repeated or does not appear at all. Find out which was the number that puzzled Prakash for sometime, after which he realised that it was just a coincidence.

Constraints
0 <   N  <= 100
0 <= A[i] <= 100
 

Input Description:
The first line contains a positive integer N, denoting the size of the array. The second line contains N positive integers, denoting the face values that appeared when the die was rolled.

Output Description:
Print out the singly occurring number.

Sample Input :
5
1 1 2 5 5
Sample Output :
2*/