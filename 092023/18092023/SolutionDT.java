import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s;
        int i;
        
        // split method alternative
        while(sc.hasNext()){
            s = sc.next();
            for(i=1; i<=s.length(); i++)
                System.out.println(s.substring(0,i));
        }
	}
}