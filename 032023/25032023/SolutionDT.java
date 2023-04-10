import java.util.*;
 
class SolutionDT {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        
        System.out.println("-"+"*".repeat(2*n-1));
        
        int lines=0;
        for(int i=1; i<=n; i+=2) lines++;
        
        int dCt=0;
        
        while(lines>0){
            System.out.println("-".repeat(dCt)+"*".repeat(lines)+"-".repeat(n)+"*".repeat(lines));
            
            lines--;
            dCt+=2;
            n-=2;
        }

	}
}