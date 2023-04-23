import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt(), x=sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                char c = sc.next().charAt(0);
                System.out.print( (j<x || j>=n-x) && (i<x || i>=n-x) ? c+" " : "* "); 
            }
            System.out.println();
        }

	}
}