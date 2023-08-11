import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        int a=sc.nextInt(), b=sc.nextInt();
        
        byte ar[] = new byte[1000001];
        
        int tmp;
        
        if(x>y){
            tmp=x;
            x=y;
            y=tmp;
        }
        if(a>b){
            tmp=a;
            a=b;
            b=tmp;
        }
        
        while(x<=y){
            ar[x]++;
            x++;
        }
        while(a<=b){
            ar[a]++;
            a++;
        }
        
        byte f=0;
        for(int i=0; i<1000001; i++){
            if(ar[i]==2){
                System.out.print(i);
                f=1;
            }
        }
        
        if(f==0){
            System.out.print(-1);
        }
        

	}
}S