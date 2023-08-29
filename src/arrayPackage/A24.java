package arrayPackage;
import java.util.HashMap;
import java.util.Scanner;

public class A24 {
 public static void main(String[] args) {

 Scanner input = null;
 String name;
 int age ;
 HashMap<String, Integer> hMap = new HashMap<String, Integer>();
 try {
 input=new Scanner(System.in);
 System.out.println("Build HashMap with Details:");
 while (input.hasNext()) {
 name = input.next();
 age = input.nextInt();
 hMap.put(name,age);
 }
 System.out.println("HashMap with Details:");
 hMap.forEach((Name,Age) -> System.out.println("Name: "+Name+
" Age:"+ Age));
 }
 catch (Exception e) {
 e.printStackTrace();
 } finally
 {
 if(input!=null)
 {input.close();}
 }

 }

}
//import java.util.*;
//public class A24 {
//
//	public static void main(String[] args) {
		
	
//		Scanner object=new Scanner(System.in);
//		int n=object.nextInt();
//		
//			 
//		HashMap<String, Integer> hm=new HashMap<>();
//		
//          for(int i=0;i<n;i++) {
//        	  String Name;
//     		 int Age ;	
//        	  while (object.hasNext()) {
//        		  Name = object.next();
//        		  Age = object.nextInt();
//        		  hm.put(Name,Age);
//        		  }}
//          hm.forEach((Name,Age) -> System.out.println("Name: "+Name+
//        		  " Age:"+ Age));
//        		   }
//          
//	}


/*You are a software engineer at an MNC. You are given the task of sorting the employees in your company based on their salary. Perform the task so that the employees, including yourself, will get a bonus from the management.

CONSTRAINT:

0<=salary<=1000000

 

Input Description:
Number of employees followed by their name and salary

Output Description:
Sorted list of employee names

Sample Input :
3
Karthik 23000 rohan 81734 varshini 12343
Sample Output :
varshini
Karthik
Rohan*/