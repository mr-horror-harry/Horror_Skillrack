import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        byte n=sc.nextByte();
        
        byte l=(byte)s.length();
        
        if(l%n==0){
            for(byte i=0; i<l; i++){
                System.out.print((i+1)%n==0 ? s.charAt(i) : "");
            }
        }
        else{
            for(byte i=0; i<l; i++){
                System.out.print((i+1)%n!=0 ? s.charAt(i) : "");
            }
        }
        
	}
}