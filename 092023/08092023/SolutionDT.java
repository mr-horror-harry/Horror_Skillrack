import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res=-1, x, ct=0, tCt, i;
        
        while(n-->0){
            x = sc.nextInt();
            tCt=2;
            for(i=2; i*i<x; i++)
                if(x%i==0)
                    tCt+=2;
            
            if(i*i==x)
                tCt++;
            
            if(tCt>ct){
                ct=tCt;
                res=x;
            }
            else if(tCt==ct)
                if(x>res)
                    res=x;
            
        }
        System.out.print(res);
	}
}