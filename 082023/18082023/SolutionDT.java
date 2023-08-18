import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        byte n = new Scanner(System.in).nextByte();
        
        StringBuilder sb = new StringBuilder("0 1");
        int n1=0, n2=1, tmp;
        
        while(n-->0){
            System.out.println(sb);
            
            tmp = n2;
            n2 += n1;
            n1 = tmp;
            
            sb.append(" " + n2);
        }
        

	}
}
