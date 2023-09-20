import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        int val=1, j;
        
        for(int i=1; i<=n; i++, val++){
            for(j=1; j<=n; j++)
                System.out.print(j==val ?
                                (j+" ").repeat(i) : j+" "
                            );
                            
                System.out.println();
        }
	}
}