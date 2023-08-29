package arrayPackage;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class A6 {

public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int N=object.nextInt();
        int[] s=new int[N];
        
        LinkedHashSet<String> hs=new LinkedHashSet<>();
        for(int i=0;i<s.length;i++) {
        	hs.add(object.next());
        }
        Object[] ss=hs.toArray();
        
        int i;
        for(i=0;i<ss.length-1;i++) {
        	
         System.out.print(ss[i]+" ");
	}
        System.out.print(ss[i]);
}
}


//int i;
//for( i=0;i<N;i++) {
//	for( int j=0;j<N;j++) {
//		if(s[i]==s[j]) {
//		for(int k=j;k<N-1;k++) {
//			s[k]=s[k+1];
//				
//			}
//		N--;
//			//j--;
//	}
//	}
//}
//for(int a=0;a<N;a++) {
//	System.out.print(s[a]+" ");
//}



/*You are a passport issuer, but due to some problems in the system, there are redundant  passport numbers. Your task is to delete all the duplicate passport numbers. You are given a list of passport numbers.

Input Description:
You are given length of list.Second line,You are given with a list.

Output Description:
Print the list of passport numbers without duplicates.

Sample Input :
5
A23 B56 B56 C79 D16
Sample Output :
A23 B56 C79 D16*/