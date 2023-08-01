import java.util.*;
public class Hello {
    
    public static int digitalSum(int x){
        return x%10 + x/10;
    }

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        int res;
        
        for(int i=0; i<ar.length-1; i++){
            
            res=digitalSum((ar[i]-'0') + (ar[i+1]-'0'));
            
            System.out.print(res>9 ? digitalSum(res) : res);
        }
        
	}
}