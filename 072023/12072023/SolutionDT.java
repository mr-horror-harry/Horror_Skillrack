import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String m=sc.next(), n=sc.next();
        byte i=0, j= (byte) (n.length()-1);
        
        int res=0;
        while(j>=0)
            res += (m.charAt(i++)-'0')*(n.charAt(j--)-'0');

        System.out.print(res);
        
	}
}