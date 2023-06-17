import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte x, ct=0;
        
        try{
            while(true){
                x=sc.nextByte();
                if(x!=n) ct++;
            }
        }
        catch(Exception e){
            System.out.print(ct);
        }

	}
}