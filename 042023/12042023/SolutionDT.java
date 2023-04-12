import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        long n = new Scanner(System.in).nextLong();
        n++;
        
        String s=n+"";
        
        int i=s.length()-1;
        while(s.charAt(i)=='0') i--;
        
        System.out.print(s.substring(0,i+1));

	}
}