// Time complexity + Space complexity code

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(new Scanner(System.in).next());
        
        byte i=0;
        try{
            while(i < sb.length()){
                
                System.out.print(sb.charAt(i));
                System.out.print(i<sb.length()-1 ? "*" : "");   // last cahr condition
                
                sb.replace(i, i+1, "*");
                i+=2;
            }
        }
        catch(Exception e){
            
        }
        
        System.out.print("\n" + sb);
        
	}
}