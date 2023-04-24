import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        String s;
        int max=0;
        
        List <String> li = new ArrayList<>();
        for(int i=0; i<n; i++){
            s=sc.next();
            if(s.length() > max) max = s.length();
            
            li.add(s);
            
        }
        
        for(String x : li){
            System.out.println( "*".repeat(max - x.length()) + x );
        }

	}
}