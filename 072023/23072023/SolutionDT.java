import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ar[] = new int[n], res=0, x;
        
        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();
        
        x=sc.nextInt();
        
        for(int i:ar)
            res += i>=x ? 1 : -1;
            
        System.out.print(res >= 0 ? res : -1*res);
        
	}
}