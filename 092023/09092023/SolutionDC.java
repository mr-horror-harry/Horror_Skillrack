import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner s  = new Scanner(System.in);
        
        int i=2, n=sc.nextInt(), x=sc.nextInt();
        StringBuilder sb = new StringBuilder("1 ");
        
        while(i<=n)
            sb.append(i++ + " ");
            
        while(x-->0)
            System.out.print(sb);
	}
}