import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt(), t;
        
        int tx=1, ty=2, tz=3;
        
        while(tx<x && ty<y && tz<z){
            tx++;
            ty++;
            tz++;
        }
        
        System.out.print(tx + ty + tz);
	}
}