import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        byte n = new Scanner(System.in).nextByte(), j;
        
        for(byte i=0; i<n; i++){
            if(i%2==0)
                for(j=0; j<n; j++)
                    System.out.print(j%2==0 ? "#" : "*");
                    
            else
                for(j=0; j<n; j++)
                    System.out.print(j%2==0 ? "*" : "#");
                    
            System.out.println();
        }

	}
}
