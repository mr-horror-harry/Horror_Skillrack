import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String s = sc.next();
        int ct=0;
        while(sb.indexOf(s)!=-1){
            sb.delete(sb.indexOf(s), sb.indexOf(s)+s.length());
            ct++;
        }
        
        System.out.print(ct==0 ? -1 : ct);
	}
}