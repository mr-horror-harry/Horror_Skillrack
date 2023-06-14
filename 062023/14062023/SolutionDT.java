import java.util.*;

public class Hello {

    public static void main(String[] args) {

        char ar[] = new Scanner(System.in).next().toCharArray();

        int max = 0, f = 0;
        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    f = 1;
                    if (j - i > max) {
                        max = j - i;
                    }
                }
            }
        }
        System.out.print(f == 0 ? -1 : max - 1);
    }
}