import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char ar[] = sc.next().toCharArray();
        byte n = sc.nextByte();
        
        for(byte i=(byte)(n-1); i>=0; i--)
            System.out.printf("%c",
                ar[i]>='a' && ar[i]<='z' ?
                    ar[i]-'a'+'A' :
                    ar[i]-'A'+'a'
            );
        
	}
}