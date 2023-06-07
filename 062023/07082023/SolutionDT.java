import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, tmp, n=sc.nextInt(), y=sc.nextInt();
        byte f, fR=0;
        while(n-->0){
            x = sc.nextInt();
            tmp=x;
            f=0;
            while(tmp>0){
                if(tmp%10==y){
                    f=1;
                    break;
                }
                tmp/=10;
            }
            if(f==0){
                System.out.print(x+" ");
                fR=1;
            }
        }
        System.out.print(fR==0 ? -1 : "");

	}
}