import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char ar[] = sc.next().toCharArray();
        char x = sc.next().charAt(0);
        int ct = sc.nextInt();
        int f=0;
        
        for(char c:ar){
            if(c==x){
                if(ct>0){
                    ct--;
                }
                else{
                    System.out.print(c);
                    f=1;
                }
            }
            else{
                System.out.print(c);
                f=1;
            }
        }
        
        if(f==0)
            System.out.print(-1);
	}
}