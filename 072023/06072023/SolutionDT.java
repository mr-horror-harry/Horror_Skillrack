import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        int h=0, t=s.length()-1;
        int hct=1, tct=t+1;
        
        while(t>=0){
            System.out.print((s.charAt(t)+"").repeat(tct--));
            System.out.println((s.charAt(h)+"").repeat(hct++));
            h++;
            t--;
        }
        
	}
}