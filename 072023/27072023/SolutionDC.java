import java.util.*;
public class Hello {
    
    int countFactors(int n){
        
        if(n==1)
            return 1;
        
        int ct=2;
        for(int i=2; i<=n/2; i++)
            if(n%i==0)
                ct++;
        
        return ct;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Hello hlo = new Hello();
        
        byte n = sc.nextByte();
        int x, ct, min=Integer.MAX_VALUE/2;
        
        while(n-->0){
            x = sc.nextInt();
            ct = hlo.countFactors(x);
            
            if(ct < min)
                min = ct;
        }
        System.out.print(min);
	}
}