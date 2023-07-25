import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        byte n=sc.nextByte(), not=0;
        
        while(n-->0)
            not += sc.nextByte()%2==0 ? 1 : -1;
            
        System.out.print(not==0 ? -1 : not>0 ? "even" : "odd");

	}
}