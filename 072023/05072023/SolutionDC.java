import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        int ct=n/10%10;
        String s=n+"";
        for(int i=0; i<s.length(); i++){
            System.out.print((s.charAt(i)+"").repeat(ct));
        }
        
	}
}