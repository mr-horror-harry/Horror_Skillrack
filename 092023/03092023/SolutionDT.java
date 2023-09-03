import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), x, i, min=100000, max=1, ct=0;
        
        Set<Integer> set = new HashSet<>();
        
        for(i=0; i<n; i++){
            x=sc.nextInt();
            set.add(x);
            
            if(x<min) min=x;
            if(x>max) max=x;
            
        }
        
        for(i=min; i<max; i++)
            if(!set.contains(i))
                ct++;
                
        System.out.print(ct);
	}
}