import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        byte i=0, j=(byte)(s.length()-1), ct=0;
        
        while(i <= j){
            System.out.println("*".repeat(ct)+s.substring(i, j+1)+"*".repeat(ct));
            i++; j--; ct++;
        }
	}
}