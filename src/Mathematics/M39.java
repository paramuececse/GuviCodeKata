package Mathematics;
import java.util.*;
public class M39 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int L=object.nextInt();
		int B=object.nextInt();
		int H=object.nextInt();
		int cubiod_area=2*(L*B + B*H +H*L);
		int cubiod_volume=L*B*H;
		System.out.print(cubiod_area+" ");
		System.out.print(cubiod_volume);

	}

}
/*Write a program to calculate the total surface area and volume of cuboid. Input contains three space separated positive integers L, B, H denoting the length, width and height of cuboid respectively.
Sample Testcase :
INPUT
1 2 3
OUTPUT
22 6*/