import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct = sc.nextInt();
        
        int ar[] = new int[n];
        for(int i=0; i<n; i++) ar[i]=sc.nextInt();
        
        Arrays.sort(ar);
        
        int res=0;
        for(int i=0; i<ct; i++)
            if(ar[i]<0) res+=ar[i];
        
        System.out.print(res*-1);
	}
}