import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), str=sc.next();
        
        if(s.equals(str)){
            System.out.print(-1);
            return;
        }
        
        String ar[]=s.split(str);
        int len=0;
        String res="";
        for(String x:ar){
            if(x.length()>len){
                len=x.length();
                res=x;
            }
        }
        System.out.print(res);

	}
}