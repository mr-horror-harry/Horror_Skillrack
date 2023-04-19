import java.util.*;
public class Hello {

    public static void main(String[] args)throws Exception {
        
        StringBuilder sb = new StringBuilder( new Scanner(System.in).next() );
        
        byte u=(byte)(sb.charAt(sb.length()-1)-'0');
        
        byte i=(byte)(sb.length()-1);
        
        while(i>=0){
            
            if(sb.charAt(i)-'0'==u){
                sb.deleteCharAt(i);
            }
            i--;
        }
        
        try{
            System.out.print(Integer.parseInt( sb.toString() ));
        }
        catch(Exception e){
            System.out.print(-1);
        }
	}
}