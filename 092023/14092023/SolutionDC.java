import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        byte hash[] = new byte[10];
        
        while(n>0){
            hash[n%10]++;
            n/=10;
        }
        
        boolean f=true;
        for(int i=8; i>=0; i-=2){
            while(hash[i]-->0){
                System.out.print(i);
                f=false;
            }
        }
        
        if(f)
            System.out.print(-1);
	}
}