package arrayPackage;
import java.util.Arrays;
import java.util.Scanner;
public class A2 {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	int array_size=object.nextInt();
	int[] array=new int[array_size];
	for (int i=0;i<array.length;i++) {
		if(object.hasNext()) {
		array[i]=object.nextInt();
	}}
    Arrays.sort(array);
    int i,j,count;
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
          System.out.println(array[i]);
       }
    }
}
}