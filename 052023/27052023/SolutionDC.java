import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        short ar[] = new short[n+1];
        int i;
        for(i=0; i<n; i++) ar[sc.nextInt()]=1;
        
        for(i=1; i<=n; i++) if(ar[i]==0) System.out.print(i + " ");
        
	}
}