package Basic;
import java.util.Scanner;
public class b23 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int num1=object.nextInt();
		int num2=object.nextInt();
		int mod1;
		int mod2;
		int mod_mod;
		mod1=num1%10;
		mod2=num2%10;
		int div1;
		int div2;
		int s1;
		int sum=mod1+mod2;
		if(sum<10) {
			sum=num1+num2;
			System.out.println(sum);
		}
		else {
			mod_mod=(mod1+mod2)%10;
			div1=num1/10;
			div2=num2/20;
			s1=div1+div2;
			System.out.println(mod_mod);
			
		}
		
	}

}
