// Pattern using Repeat method of java

import java.util.*;

public class Hello {

    public static void main(String[] args) {

        byte n = new Scanner(System.in).nextByte();
        byte d = (byte) (n - 1), tmp = 0;

        int ct = 2 * n - 1, val = 0, vCt = 1, tCt;
        while (ct-- > 0) {

            System.out.print("-".repeat(d) + "<");

            tCt = vCt;
            while (tCt-- > 0) {
                System.out.print(val++ % 10);
            }
            System.out.println(">");

            tmp = ct >= n ? (byte) -1 : (byte) +1;
            d += tmp;
            vCt += -2 * tmp;

        }
    }
}