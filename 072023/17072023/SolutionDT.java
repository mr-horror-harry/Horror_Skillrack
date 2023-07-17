import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String ar[] = new Scanner(System.in).next().split("\\.");
        
        StringBuilder s1=new StringBuilder(ar[0]), s2=new StringBuilder(ar[1]);
        
        s1.reverse();
        s2.reverse();
        
        String res = s1.append(".").append(s2).toString();
        
        System.out.printf("%.2f" , Double.parseDouble(res));
	}
}