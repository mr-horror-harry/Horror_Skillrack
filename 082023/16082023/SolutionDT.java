import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        int x=2, ct=1;
        
        while(x<=n){
            if(x+1==n || x-1==n){
                System.out.print(ct);
                return;
            }

            x*=2;
            ct++;

            if(x+1==n || x-1==n){
                System.out.print(ct);
                return;
            }
        }
        
        System.out.print("No");
	}
}