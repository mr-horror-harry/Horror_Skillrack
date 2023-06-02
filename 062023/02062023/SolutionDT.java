import java.util.*;

public class Hello {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        String ar[] = new String[n];
        int val = n;

        int ct, ds = 0;
        StringBuilder sb;
        for (int i = 0; i < n; i++) {

            ct = 2 * (n - i);
            sb = new StringBuilder("");

            sb.append("-".repeat(ds));

            while (ct-- > 0) {
                if (ct != 0) {
                    sb.append(val + "*");
                } else {
                    sb.append(val);
                }
            }
            ar[i] = sb.toString();
            System.out.println(sb);
            val--;
            ds += 2;
        }

        System.out.println("-".repeat(2 * n - 1) + "*");

        for (int i = n - 1; i >= 0; i--)
            System.out.println(ar[i]);

    }
}