import java.util.*;
public class Hello {
    
    int removeTrailz(int n){
        while(n%10==0)
            n/=10;
        return n;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        
        Hello obj = new Hello();
        int res = 99999999, x;
        
        while(n-->0){
            x = sc.nextInt();       // user input
            
            x = obj.removeTrailz(x); // reusing to reduce digit
            
            if(x<res)
                res=x;              // comparision & updation
        }
        System.out.print(res);
	}
}