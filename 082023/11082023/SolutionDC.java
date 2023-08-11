import java.util.*;
public class Hello {
    
    int pow2(byte p){
        int res=1;
        while(p-->0)
            res*=2;
            
        return res;
    }

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        Hello soln = new Hello();
        
        byte p=(byte) (s.length()-1);
        int res=0;
        
        for(byte i=0; i<s.length(); i++, p--)
            if(s.charAt(i)=='a')
                res += soln.pow2(p);
                
        System.out.print(res);

	}
}