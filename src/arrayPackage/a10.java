package arrayPackage;

import java.util.Arrays;
 
public class a10{

    public static void main(String[] args) {
        int element = Integer.MIN_VALUE, max_count=1, count=1;
        
        //intial array
        int arr[] = {2, 4, 6, 4, 2, 4, 5, 8};
        
        //sort array in the ascending Order
        Arrays.sort(arr);
        
        //loop through the array elements
        for(int i=1; i<arr.length; i++){
            //count the successive elements as long as they are same
            if(arr[i] == arr[i-1])
                count++;
                
            if(arr[i] != arr[i-1] || i==arr.length-1){
                //compare the count with max_count
                if(count>max_count){
                    
                    //update if count is greater
                    max_count = count;
                    element = arr[i-1];
                } 
                //reset count to 1
                count =1;
            }
        }
        
        //output the most repeated element along with the count
        System.out.println(element+": "+max_count);    
    }
}
/*You are given an array of numbers. Print the least occurring element. If there is more than 1 element print all of them in decreasing order of their value.

Input Description:
You are given a number ‘n’ denoting size of array. Next line contains n space separated numbers.

Output Description:
Print the number as mentioned

Sample Input :
9
1 6 4 56 56 56 6 4 2
Sample Output :
2 1
*/