import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt(),
            a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        
        a-=x;
        if(a<0){
            System.out.print("NO");
            return;
        }
        
        int tmp=a+b;
        tmp-=y;
        if(tmp<0){
            System.out.print("NO");
            return;
        }
        
        if(tmp+c < z){
            System.out.print("NO");
            return;
        }
        System.out.print("YES");
	}
}