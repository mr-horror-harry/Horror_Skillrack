import java.util.*;
public class Hello {
    
    static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E'|| c=='I' || c=='O' || c=='U';
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] s1=sc.next().toCharArray(), s2=sc.next().toCharArray();
        
        for(int i=0; i<s1.length; i++){
            if(!(isVowel(s1[i]) && isVowel(s2[i]) || !isVowel(s1[i]) && !isVowel(s2[i]))){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
	}
}
