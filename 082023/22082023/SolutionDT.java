import java.util.*;
public class Hello {
    
    static void repChar(int n){
        while(--n>0)
            System.out.print("*-");
        System.out.print("*");
    }

    public static void main(String[] args) {
        
        int n=new Scanner(System.in).nextByte();
        int lCt=2*n-1, hCt=n-1, ct=1;
        
        while(lCt>0){
            if(lCt>=n){
                System.out.print("#".repeat(hCt));
                repChar(ct++);
                System.out.println("#".repeat(hCt--));
            }
            else{
                if(lCt==n-1){
                    hCt=1;
                    ct=n-1;
                }
                
                System.out.print("#".repeat(hCt));
                repChar(ct--);
                System.out.println("#".repeat(hCt++));    
            }
            
            lCt--;
        }

	}
}