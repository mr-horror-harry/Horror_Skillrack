import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(new Scanner(System.in).next());
        
        for(int i=sb.length()-1; i>=0; i--){
            char c = sb.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                sb.deleteCharAt(i);
            }
        }
        
        String s=sb.toString();
        if(s.equals("")){
            System.out.print(-1);
            return;
        }
    
        for(int i=0, j=s.length()-1; i<j; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
	}
}