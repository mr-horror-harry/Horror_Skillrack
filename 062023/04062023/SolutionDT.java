import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        
        StringBuilder sb =new StringBuilder(s.substring(0, n) + s.substring(s.length()-n));
        
        System.out.print(sb);
        int l=s.length()-2*n;
        int ptr=0;
        
        while(l-->0){
            System.out.print(sb.charAt(ptr++));
        }
	}
}