import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int ar[] = new int[n];
        for(int i=0; i<x-1; i++){
            ar[i] = sc.nextInt();
        }
        
        int ct, hash[], res=0;
        boolean f;
        
        for(int i=x-1; i<n; i++){
            
            ar[i] = sc.nextInt();
            
            ct=x;
            f = true;
            hash = new int[10001];
            
            for(int j=i; ct>0; j--){
                if(hash[ ar[j] ]!=0){
                    f=false;
                    break;
                }
                else{
                    hash[ ar[j] ]++;
                }
                ct--;
            }
            
            if(f) res++;
            
        }
        System.out.print(res);

	}
}