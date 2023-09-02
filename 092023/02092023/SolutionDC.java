import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2=sc.nextLine();
        
        int res=s1.length() - s2.length();
        
        System.out.print(s1);
        
        System.out.print(res>=0 ? "\n" + "*".repeat(res) : "*".repeat(-1*res) + "\n");
        
        System.out.print(s2);

	}
}