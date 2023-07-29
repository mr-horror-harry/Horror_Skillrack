import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        boolean f=false;
        int x = new Scanner(System.in).nextInt();
        
        int tmp = Math.abs(x);
        if( ((tmp+"").charAt(0)-'0')%2==0 )
            f=true;
            
        System.out.print(f ? "*".repeat( (int) Math.log10(tmp) + 1) : x);

	}
}