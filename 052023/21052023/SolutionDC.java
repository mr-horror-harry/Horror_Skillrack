import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        int n=s.length();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                
                int val=Integer.parseInt(s.substring(j-i, j));
                
                if((val+"").length()==i && val%2==0)
                    System.out.print(val+" ");
                
            }
        }
        
	}
}