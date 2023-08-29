package arrayPackage;
import java.util.*;
public class A77 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
	    int[] array=new int[N];
	for(int i=0;i<array.length;i++) {
		array[i]=object.nextInt();
	
	}
	int count=1;
	for(int i=0;i<array.length;i++) {
	if(array[i]%2==0 && count==1) {
		count++;
		System.out.println(array[i]);
	}
	else if(array[i]%2!=0 && count==1) {
		count++;
		System.out.println(array[i]);
	}
	else {
		System.out.println("-1");
	}

}}
}
/*Given an array of N elements which follows either even number or odd number series.There may exists at maximum 1 even number in the odd series or 1 odd number in the even series.Find the different number if exists otherwise print '-1'?
Input Size : |N| <= 100000
Sample Testcase :
INPUT
5
1 3 4 5 7
OUTPUT
4*/