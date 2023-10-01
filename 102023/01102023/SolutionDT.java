import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        
        for(int i=0; i<ar.length; i++){
            
            if(Character.isLowerCase(ar[i]))
                System.out.print(Character.toUpperCase(ar[i]));
            else
                System.out.print(Character.toLowerCase(ar[i]));
                
            try{
                System.out.print(ar[++i]);
            }
            catch(Exception e){
                
            }
        }
        
	}
}