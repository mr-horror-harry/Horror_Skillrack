import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int res=0;
        while(n-->0){
            long max=0;
            long x=sc.nextLong();
            while(x>0){
                if(x%10 > max)
                    max=x%10;
                x/=10;
            }
            res+=max;
        }
        System.out.print(res);
	}
}