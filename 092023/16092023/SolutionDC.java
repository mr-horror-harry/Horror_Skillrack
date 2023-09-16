import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        
        int mid = n%2==0 ? n/2 : n/2 + 1;
        
        System.out.print( k<=mid ? 2*k-1 : 2*(k-mid) );
	}
}