import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x=sc.nextInt(), y=sc.nextInt();
        
        int ct=0;
        while(x<=y){
            
            String s = (x*x*x)+"";
            
            if( s.substring(s.length() - (x+"").length()).equals(x+"") ){
                System.out.print(x+" ");
                ct=1;
            }
            x++;
        }
        
        System.out.print(ct==0 ? -1 : "");
	}
}