import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner (System.in).nextInt();
        
        Set<Integer> set = new TreeSet<>();
        
        for(int i=1; i*i<=n; i++){
            if(n%i==0 && i%2==0)
                set.add(i);
            if(n%(n/i)==0 && (n/i)%2==0)         
                set.add(n/i);
        }
        
        for(int x:set)
            System.out.print(x+" ");

	}
}