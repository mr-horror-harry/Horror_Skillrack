import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        int i=0, j=ar.length-1, k;
        
        while(i<=j){
            
            for(k=0; k<ar.length; k++)
                System.out.print(
                        k==i || k==j ? "(" + ar[k] + ")" : ar[k]
                     );
                     
            System.out.println();
            
            i++;
            j--;
        }
        
	}
}