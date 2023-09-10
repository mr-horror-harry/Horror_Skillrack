import java.util.*;
public class Hello {
    
    static boolean isVow(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        
        int i=0, j=ar.length-1, l=ar.length-2, ct=1, tCt, ti, tj, k;
        boolean f;
        
        while(l>=0){
            tCt=ct;
            ti=i; tj=j;
            
            while(tCt-->0){
                
                if(!isVow(Character.toLowerCase(ar[ti])) ||
                    !isVow(Character.toLowerCase(ar[tj]))){
                    ti++;
                    tj++;
                    continue;
                }
                
                f=true;
                
                for(k=ti+1; k<tj; k++){
                    if(isVow(Character.toLowerCase(ar[k]))){
                        f=false;
                        break;
                    }
                }
                
                if(f){
                    System.out.print(l);
                    return;
                }
                
                ti++;
                tj++;
            }
            
            j--;
            ct++;
            l--;
        }
        
	}
}