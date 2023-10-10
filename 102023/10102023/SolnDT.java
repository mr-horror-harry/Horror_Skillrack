import java.util.*;
public class Hello {
    static int leadZeros(String s){
        int ct=0, i=0;
        while(s.charAt(i++)=='0')
            ct++;
        return ct;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        
        int lead=leadZeros(s);
        System.out.print(Long.valueOf(s)+"0".repeat(lead));
	}
}