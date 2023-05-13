import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        short x=sc.nextShort(), y=sc.nextShort(), n=sc.nextShort();
        
        while(x>=n){
            x-=y;
            if(x == n){
                System.out.print("YES");
                return;
            }
        }
        
        System.out.print("NO");

	}
}