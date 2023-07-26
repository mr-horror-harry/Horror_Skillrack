import java.util.*;

class Solution{
    boolean isPrime(byte n){
        for(byte i=2; i*i <= n; i++)
            if(n%i==0)
                return false;
        return true;
    }
}

public class Hello {

    public static void main(String[] args) {
        
        byte n = new Scanner(System.in).nextByte(), i=2;
        StringBuilder sb = new StringBuilder("");
        
        Solution soln = new Solution();
        
        while(i <= n){
            if(soln.isPrime(i))
                System.out.print(i + " ");
            else
                sb.append(i + " ");
            i++;
        }
        
        System.out.print("\n"+ sb);
        
	}
}