import java.util.*;
public class Hello {

    boolean isOddDigits(int n){
        while(n>0){
            if(n%10 %2 == 0)
                return false;
            n/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        boolean f=true;
        Hello obj = new Hello();
        
        while(x<=y){
            if(obj.isOddDigits(x)){
                f = false;
                System.out.print(x+" ");
            }
            x++;
        }
        
        if(f)
            System.out.print(-1);
	}
}