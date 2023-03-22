
import java.util.*;

class Hello {
    public static void main(String args[]) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder("");   // ignore the quotespace in the stringbuilder in photo

        while (n > 0) {
            sb.append(n % 8);
            n /= 8;
        }

        System.out.print(sb.reverse().equals(sb) ? "YES" : "NO");
    }
}
