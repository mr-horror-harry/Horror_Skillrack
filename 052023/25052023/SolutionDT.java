import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int ar[] = new int[n/2], i;
        for( i=0; i<n/2; i++){
            ar[i]=sc.nextInt();
        }
        
        for( i=n/2 - 1; i>=0; i--){
            ar[i]+=sc.nextInt();
        }
        
        for( i=0; i<n/2; i++){
            System.out.print (ar[i]+" ");
        }
        
	}
}