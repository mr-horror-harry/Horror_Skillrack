import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        
        StringBuilder sb1 = new StringBuilder(""), sb2 = new StringBuilder("");
        
        while(x>0){
            sb1.append(x%2);
            x/=2;
        }
        while(y>0){
            sb2.append(y%2);
            y/=2;
        }
        
        while(sb1.length() != sb2.length())
            sb2.append(0);
        
        int ct=0;
        for(int i=0; i<sb1.length(); i++)
            if(sb1.charAt(i) != sb2.charAt(i))
                ct++;
                
        System.out.print(ct);
	}
}