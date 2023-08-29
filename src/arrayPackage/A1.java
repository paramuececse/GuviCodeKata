package arrayPackage;
import java.util.Scanner;
public class A1 {
public static void main(String[] args) {
	Scanner object =new Scanner(System.in);
	int array_size=object.nextInt();
	int[] array=new int[array_size];
	int index1=0;
	int index2=0;
	for(int i=0;i<array.length;i++) {
		if(object.hasNextInt()) {
			array[i]=object.nextInt();
			
		}
	}
	
	
	int j,large=0;
	for(j=0;j<array.length;j++) {
		if(array[j]>large) {
			large=array[j];
			index1=j;
		}
	}
	System.out.println(large);
	int k,small=array[0];
	for(k=0;k<array.length;k++) {
		if(array[k]<small) {
			small=array[k];
			index2=k;
		}
	}
	System.out.println(small);
System.out.println(index1-index2);
}
}
