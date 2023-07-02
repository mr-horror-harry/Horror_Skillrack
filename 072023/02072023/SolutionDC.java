import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        
        while(n-->0){
            float x = sc.nextFloat();
            System.out.printf("%.2f ", x%10!=0 ? x/(x%10) : x);
        }
	}
}