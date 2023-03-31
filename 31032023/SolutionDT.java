import java.util.*;
class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next(), b=sc.next();
        int ans=0;
        for(int i=0; i<a.length(); i++){
            int res = (a.charAt(i)-'0') + (b.charAt(i)-'0');
            
            ans = ans*10 + res%10;
        }
        System.out.print(ans);

	}
}