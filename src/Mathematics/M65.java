package Mathematics;

import java.util.*;
public class M65 {
public static void main(String[] args) {

    Scanner object=new Scanner(System.in);
    int n=object.nextInt();
    int k=object.nextInt();
    int biggest= n<k?n:k;
    if(n%biggest==0&& k%biggest==0){
        System.out.print(biggest);
    }
}
}