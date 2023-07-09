import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        byte n = sc.nextByte();
        long l = (long) sc.nextLine().trim().length();
        
        while(n-->0) l*=2;
        
        System.out.print(l);

	}
}