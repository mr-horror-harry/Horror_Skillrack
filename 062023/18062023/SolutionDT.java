import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        
        for(byte i=0; i<s.length(); i++){
            System.out.print(s.substring(i));
        }

	}
}