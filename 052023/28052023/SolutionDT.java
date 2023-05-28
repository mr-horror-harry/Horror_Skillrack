import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        byte n = new Scanner(System.in).nextByte(), f=0;
        long res=1;
        
        for(byte i=2; i<=n; ){
            if(f==0){
                f=1;
                res *= i++;
            }
            else if(f==1){
                f=0;
                res += i++;
            }
        }
        System.out.print(res);
	}
}