import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(new Scanner(System.in).next());
        
        byte i, j;
        
        for(i=0; i<sb.length(); i++)
            if((sb.charAt(i)-'0')%2==0)
                break;
                
        for(j=0; j<sb.length(); j++)
            if((sb.charAt(j)-'0')%2==1)
                break;
        
        char x=sb.charAt(i);
        sb.replace(i, i+1, sb.charAt(j)+"");
        sb.replace(j, j+1, x+"");
        
        System.out.print(Integer.parseInt(sb.toString()));
        
	}
}