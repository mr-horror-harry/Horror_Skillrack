import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a=sc.next(), b=sc.next();
        
        System.out.print(
            Integer.parseInt(
                    ""+a.charAt(a.length()-2) + a.charAt(a.length()-1) + 
                        b.charAt(0) + b.charAt(1)
                )
            );
	}
}