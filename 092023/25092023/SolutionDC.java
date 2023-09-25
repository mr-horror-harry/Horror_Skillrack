import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        int n=1, i=0;
        while(i<s.length()){
            System.out.print(s.charAt(i));
            i+=n++;
        }
        
	}
}