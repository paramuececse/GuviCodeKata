package arrayPackage;
import java.util.*;
public class A48 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=object.nextInt();
		}
		TreeSet ts=new TreeSet();
		
		for(int num:array) {
			ts.add(num);
		}
		Object[] num1=ts.toArray();
		for(int j=0;j<num1.length-1;j++) {
			System.out.print(num1[j]+ " ");
		}
		System.out.print(num1[num1.length-1]);
	}

}
