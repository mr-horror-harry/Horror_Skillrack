import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        short ar[] = new short[n];
        int res=0;
        
        for(int i=0; i<n; i++){
            
            ar[i] = sc.nextShort();
            if(i<x)
                res+=ar[i];
        
        }
        
        for(int i=n-x; i<n; i++)
            System.out.print(res - ar[i] + " ");
	}
}