import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        
        while(n-->0)
            if(k+sc.nextInt() <= 5)
                ct++;
        
        System.out.print(ct/3);
        
	}
}