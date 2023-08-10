import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        String ar[] = new String[n];
        
        for(int i=0; i<n; i++)
            ar[i]=sc.next();
            
        String res=ar[0], tAr[], rAr[];
        
        for(int i=1; i<n; i++){
            tAr = ar[i].split("/");
            rAr = res.split("/");
            
            if(pInt(tAr[2]) < pInt(rAr[2])){
                res=ar[i];
            }
            else if(pInt(tAr[2]) == pInt(rAr[2])){
                if(pInt(tAr[1]) < pInt(rAr[1])){
                    res=ar[i];
                }
                else if(pInt(tAr[1]) == pInt(rAr[1])){
                    if(pInt(tAr[0]) < pInt(rAr[0])){
                        res=ar[i];
                    }
                }
            }
            
        }
        
        System.out.print(res);
        
	}
	
	static int pInt(String s){
	    return Integer.parseInt(s);
	}
}