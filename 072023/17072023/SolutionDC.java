import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        
        int min = m<=n ? m : n;
        
        for(int i=min; i>=1; i--)
            if(m%i==0 && n%i==0)
                System.out.print(i+" ");

	}
}