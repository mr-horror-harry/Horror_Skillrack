import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int mf=0, nf=0;
        
        int mV=1, nV=1;
        
        while(mf==0 || nf==0){
            
            if(mf==0){
                while(mV <= m){
                    if(m%mV==0){
                        System.out.print(mV+" ");
                        mV++;
                        break;
                    }
                    mV++;
                }
                if(mV > m){
                    mf=1;
                }
            }
            if(nf==0){
                while(nV <= n){
                    if(n%nV==0){
                        System.out.print(nV+" ");
                        nV++;
                        break;
                    }
                    nV++;
                }
                if(nV > n){
                    nf=1;
                }
                
            }        
        }

	}
}