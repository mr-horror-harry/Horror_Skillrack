import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        
        boolean u=false, l=false;
        for(char c:ar){
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                u=true;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                l=true;
            
            if(l && u){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
	}
}