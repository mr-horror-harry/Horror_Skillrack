import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), k=sc.nextInt();
        int beg = (n - k)/2;
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<beg; i++) sc.nextInt();
        
        while(k-->0)
            sb.insert(0, sc.nextInt()+" ");
        
        System.out.print(sb);
        
	}
}