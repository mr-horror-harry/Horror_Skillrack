import java.util.*;
public class Hello {
    
    static long factorial(long n){
        return n==1 ? 1 : n * factorial(n-1);
    }

    static long gcd(long m, long n){
        long res = m < n ? m : n;
        while(res>0){
            if(m%res==0 || n%res==0)
                break;
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong(), n=sc.nextLong();
         
        m = factorial(m);
        n = factorial(n);
        
        System.out.print(gcd(m,n));
	}
}