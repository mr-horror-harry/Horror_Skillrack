import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int sz=sc.nextInt();
        byte f=0;
        long res=0;
        
        while(n-->0){
            String s=sc.next();
            
            if( s.length() != sz ){
                f=1;
                res+=Long.parseLong(s);
            }
        }
        System.out.println(f==1  ? res : -1);
	}
}