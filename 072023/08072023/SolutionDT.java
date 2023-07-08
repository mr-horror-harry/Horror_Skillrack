import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++) ar[i]=sc.nextInt();
        
        int res, maxRes=-1, ans=-1;
        for(int i=0; i<n; i++){
            res=0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    res+=ar[j];
                }
            }
            
            if(res > maxRes){
                if(res%10==0){
                    maxRes=res;
                    ans=ar[i];
                }
            }
        }
        
        System.out.print(ans);
	}
}