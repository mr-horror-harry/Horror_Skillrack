import java.util.*;
public class Hello {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n, e=0, o=0, f=0, ct=0;
        
        try{
            while(true){
                n=sc.nextInt();
                
                if(n==0)
                    continue;
                else if(n%2==0){
                    e+=n;
                    f=1;
                }
                else{
                    o+=n;
                    ct++;
                }
            }
        }
        catch(Exception ex){
            
            if(f==0 && ct==0)
                System.out.print(-1 + "\n" + -1);
            else if(f==0)
                System.out.printf("-1\n%.1f",(o+0.0)/ct );
            else if(ct==0)
                System.out.printf("%d\n-1", e);
            else
                System.out.printf("%d\n%.1f", e, (o+0.0)/ct);
                
        }

	}
}