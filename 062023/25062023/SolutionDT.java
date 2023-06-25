import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int ct=1;
        String s = new Scanner(System.in).next();
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                System.out.print(ct + "" +s.charAt(i-1));
                ct=1;
            }
            else{
                ct++;
            }
        }
        System.out.print(ct + "" +s.charAt(s.length()-1));
        
	}
}