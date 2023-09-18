import java.util.*;
public class Hello {
    
    static void factorizeArray(int n, int ar[]){
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                ar[i]=1;
                ar[n/i]=1;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        int max = m>n ? m : n;
        int mHash[]=new int[max+1], nHash[]=new int[max+1];
        
        factorizeArray(m, mHash);
        factorizeArray(n, nHash);
        
        boolean f=true;
        
        for(int i=max; i>1; i--){
            if(mHash[i]!=nHash[i]){
                f=false;
                System.out.print(i+" ");
            }
        }
        
        if(f)
            System.out.print(-1);
	}
}