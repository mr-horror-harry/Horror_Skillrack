import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        int i=0, f, b;
        boolean fg;
        
        while(i<s.length()){
            
            f=0; b=s.length()-1;
            fg = true;
            
            while(f<b){
                
                if(f!=i && b!=i){
                    if(s.charAt(f)!=s.charAt(b)){
                        fg=false;
                        break;
                    }
                    f++;
                    b--;
                }
                else{
                    if(f==i)
                        f++;
                    else
                        b--;
                }
            }
            
            if(fg){
                System.out.print("YES");
                return;
            }
            i++;
        }
        System.out.print("NO");

	}
}