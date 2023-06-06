import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), x=sc.nextInt();
        
        int res=0;
        int pre = sc.nextInt();
        if(pre!=x) res+=pre;
        
        for(int i=1; i<n; i++){
            int curr = sc.nextInt();
            
            if(pre!=x && curr!=x){
                res+=curr;
            }
            
            pre=curr;
            
        }
        System.out.print(res);
	}
}