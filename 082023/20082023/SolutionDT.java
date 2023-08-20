import java.util.*;
public class Hello {
    
    static String s;
    
    static void revInd(int x, int y){
        while(y!=x)
            System.out.print(s.charAt(y--));
    }

    public static void main(String[] args) {

        s = new Scanner(System.in).next();
        int b1 = s.indexOf("("), b2=s.indexOf(")");
        
        System.out.print(s.substring(0, b1));
        revInd(b1, b2-1);
        System.out.print(s.substring(b2+1));

	}
}