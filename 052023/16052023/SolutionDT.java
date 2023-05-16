import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        byte k=sc.nextByte();
        
        short ar[]=new short[26];
        for(char c:s.toCharArray()){
            ar[c-'a']++;
        }
        
        for(byte i=0; i<26; i++){
            if(ar[i]%k!=0){
                System.out.print("no");
                return;
            }
        }
        System.out.print("yes");
	}
}