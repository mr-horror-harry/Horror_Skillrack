import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mt[][] = new int[n][n];
        int i, j;

        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                mt[i][j] = sc.nextInt();

        for (j = 0; j < n; j++)
            System.out.print(mt[0][j] + " ");

        for (i = 1, j = n - 2; i < n; i++, j--)
            System.out.print(mt[i][j] + " ");

        for (j = 1; j < n; j++)
            System.out.print(mt[n - 1][j] + " ");

        for (i = n - 2; i >= 1; i--)
            System.out.print(mt[i][i] + " ");
    }
}