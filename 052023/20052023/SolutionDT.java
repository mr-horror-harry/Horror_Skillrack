import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String ar1[] = sc.nextLine().split(" "),
                ar2[] = sc.nextLine().split(" ");
                
        int mx1=1, mn1=100000001, mx2=1, mn2=100000001, x;
        
        for(String s : ar1){
            x = Integer.parseInt(s);
            if(x>mx1) mx1=x;
            if(x<mn1) mn1=x;
        }
        
        for(String s : ar2){
            x = Integer.parseInt(s);
            if(x>mx2) mx2=x;
            if(x<mn2) mn2=x;
        }
        
        System.out.print(mx1+mn2 == mx2+mn1 ? "YES" : "NO");

	}
}