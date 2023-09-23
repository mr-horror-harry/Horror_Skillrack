import java.util.*;
public class Hello {
    
    static boolean sumOf3(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum%3==0;
    }

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        while(true){
            n++;
            if(n%3==0 && sumOf3(n))
                break;
        }
        System.out.print(n);
	}
}