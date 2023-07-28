import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        byte n = new Scanner(System.in).nextByte(), ct;
        int j;
        
        for(byte i=1; i<=n; i++){
            
            ct=0;
            for(j=i; ct<n; j+=i, ct++)
                System.out.print(j+" ");
                
            System.out.println();
        }

	}
}