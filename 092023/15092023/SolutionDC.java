import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s1=sc.next(), s2=sc.next();
        
        for(byte i=0; i<s1.length(); i++)
            System.out.print(s1.charAt(i)==s2.charAt(i) ? 0 : 1);

	}
}