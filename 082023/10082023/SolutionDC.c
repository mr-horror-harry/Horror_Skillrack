import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        byte n = new Scanner(System.in).nextByte(), i=1;
        
        while(i <= n/2)
            System.out.println((i+"").repeat(i)+
                                (n-i+1+"").repeat(n-(i++)+1));
        
	}
}