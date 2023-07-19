import java.util.*;
public class Hello {
    
    static boolean isCons(char c){
        return !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        int hash[] = new int[26];
        
        for(char c:ar)
            if(isCons(c))
                hash[c-'a']++;
        
        int res=0, oF=0;
        for(int i:hash){
            if(i%2==0)
                res+=i;
            else{
                oF=1;
                res+=i-1;
            }
        }
        
        System.out.print(oF==1 ? ++res : res);

	}
}
