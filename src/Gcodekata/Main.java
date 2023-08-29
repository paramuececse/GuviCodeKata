package Gcodekata;
import java.util.*;
public class Main{

   //main method
   public static void main(String[] args) {
   
      
//Declare and initialize the array elements
      int[] array = { 11, 11 ,11 ,95 ,95 ,95 ,65, 65, 65, 56, 56};
      
      //sorting an array
      Arrays.sort(array);
      
      //declaring the variables
      int i,j,count;
      System.out.println("These elements are repeated along with its frequency-");
      
      //loop for logic implementation
      for(i=0; i<array.length; i++){
    	  count = 1;
         for(j=i+1; j<array.length; j++){
            if(array[j] == array[i]){
            	count++;
            } 
            else {
               break;
            }
         }
         i=j-1;
         if(count ==2){
         
            //printing the output
            System.out.println(array[i] + " --> " + count);
         }
      }
   }
   
}