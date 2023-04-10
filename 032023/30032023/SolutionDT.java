import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        
        int ct = n/x;
        
        int i=0;
        while(ct-->0){
            int tx = x;
            int min=100000001;
            
            int num;
            while(tx-->0){
                num = sc.nextInt();
                if(num <= min) min=num;
            }
            System.out.print(min+" ");
        }
        
	}
}