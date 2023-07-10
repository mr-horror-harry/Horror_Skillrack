import java.util.*;
public class Hello {
    
    static boolean isVow(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String x=sc.next(), y=sc.next(), z=sc.next();
        
        int l = Math.max(x.length(), Math.max(y.length(), z.length()));
        
        int v, c;
        for(int i=0; i<l; i++){
            v=0;
            c=0;
            if(i<x.length()){
                if(isVow(Character.toLowerCase(x.charAt(i)))) v++;
                else c++;
            }
            if(i<y.length()){
                if(isVow(Character.toLowerCase(y.charAt(i)))) v++;
                else c++;
            }
            if(i<z.length()){
                if(isVow(Character.toLowerCase(z.charAt(i)))) v++;
                else c++;
            }
            
            System.out.print(v>c ? "V" : c>v ? "C" : "E");
        }

	}
}