import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt(), i;
        
        int a1[] = new int[m], a2[] = new int[n];
        for(i=0; i<m; i++)
            a1[i]=sc.nextInt();
        for(i=0; i<n; i++)
            a2[i]=sc.nextInt();
        
        m--; n--;
        while(m>=0 && n>=0){
            
            System.out.print(a1[m] > a2[n] ? a1[m]+" " : a2[n]+" ");
            
            m--;
            n--;
        }
        
        while(m>=0)
            System.out.print(a1[m--]+" ");
        while(n>=0)
            System.out.print(a2[n--]+" ");
        
	}
}