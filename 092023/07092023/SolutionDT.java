import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m=sc.nextInt(), n=sc.nextInt();
        int tm=m, tn=n, c=0;
        
        while(tm>=1 && tn>=2){
            c++;
            
            tm--;
            tn-=2;
        }
        
        while(m>=2 && n>=1){
            c--;
            
            m-=2;
            n--;
        }
        
        System.out.print(c==0 ? "ANYONE" : c>0 ? 1 : 2);

	}
}