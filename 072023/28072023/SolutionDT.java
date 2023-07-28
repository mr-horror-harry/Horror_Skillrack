import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        int mid=s.length()/2, ct=0;
        
        for(int i=0; i<s.length()/2+1; i++, ct++){
            
            System.out.println(s.substring(mid+ct+1)
                + s.substring(mid-ct, mid+ct+1)
                + s.substring(0, mid-ct));
                
        }

	}
}