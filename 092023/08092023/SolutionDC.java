import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), x, ar[];
        boolean f=true;
        
        while(m<=n){
            
            ar = new int[10];
            x = m;
            
            while(x>0){
                if(ar[x%10]!=0){
                    x=-1;
                    break;
                }
                else
                    ar[x%10]++;
                    
                x/=10;
            }
            
            if(x!=-1){
                System.out.print(m+" ");
                f=false;
            }
            m++;
        }
        
        if(f)
            System.out.print(-1);
        
	}
}