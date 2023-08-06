import java.io.*;
public class Hello {

    public static void main(String[] args) {
        
        try{
            StringBuilder sb = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
        
            char u=sb.charAt(sb.length()-1);
    
            for(byte i=0; i<sb.length(); i++)
                if(sb.charAt(i)==u)
                    sb.replace(i, i+1, "0");
                    
            System.out.print( Integer.parseInt(sb.toString()) );
        }
        catch(Exception e){
            
        }
	}
}