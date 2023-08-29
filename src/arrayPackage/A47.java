package arrayPackage;
import java.util.Scanner;
public class A47 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=object.nextInt();
		}
		int minimum=array[0];
		int index=0;
		for(int j=0;j<array.length;j++) {
			if(array[j]<minimum) {
				minimum=array[j];
			index=j;
			}
			//System.out.println(index);
		}
		//System.out.print(minimum);
System.out.print("Dealer");
System.out.print(index);
	}

}
