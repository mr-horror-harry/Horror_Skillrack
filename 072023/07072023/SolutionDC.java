import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int x = sc.nextInt();
        
        x -= ((n.charAt(n.length()-1)-'0') + (n.charAt(n.length()-2)-'0'));
        
        System.out.print(n.substring(0, n.length()-2)+x+n.substring(n.length()-2));

	}
}