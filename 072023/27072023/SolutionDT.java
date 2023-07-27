import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        System.out.println("* ".repeat(n));
        
        int i=1, val=1;
        while(i<=n-2){
            
            System.out.print("- ".repeat(i++) + "* ");
            
            for(int j=0; j<n-2; j++)
                System.out.print(val++ + " ");
            
            System.out.println("*");
            
        }
        
        System.out.print("- ".repeat(n-1) + "* ".repeat(n));

	}
}