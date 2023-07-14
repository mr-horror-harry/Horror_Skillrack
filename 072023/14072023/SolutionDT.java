import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x=sc.nextInt(), y;
        while(n-->1){
            y = sc.nextInt();
            
            System.out.print(x%10*10 + y/10%10 + " ");
            
            x=y;
        }
	}
}