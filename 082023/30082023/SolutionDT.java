import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(new Scanner(System.in).next());
        int x = sb.charAt(0)-'0';
        
        if(x>4 && x<9)
            sb.replace(0, 1, 9-x+"");
            
        for(int i=1; i<sb.length(); i++){
            
            x = sb.charAt(i)-'0';
            
            if(x>4)
                sb.replace(i, i+1, 9-x+"");
            
        }    
            
        System.out.print(sb);

	}
}