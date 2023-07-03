import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        byte inc=1;
        for(byte i=0; i<s.length(); i += ++inc)
            System.out.print(s.charAt(i));

	}
}