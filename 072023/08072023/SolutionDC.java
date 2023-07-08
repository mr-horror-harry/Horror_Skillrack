import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int ar[] = new int[n];
        for(int i=0; i<n; i++) ar[i]=sc.nextInt();
        
        int l, r;
        for(int i=1; i<n; i++){
            l=0;
            for(int j=0; j<i; j++) l+=ar[j];
            
            r=0;
            for(int j=i; j<n; j++) r+=ar[j];
            
            if(l==r){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
        
	}
}