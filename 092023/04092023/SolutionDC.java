import java.util.*;
public class Hello {
    
    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray(), tmp;
        int i=0, j=ar.length-1;
        
        while(i<j){
            if(isVowel(Character.toLowerCase(ar[i]))){
                i++;
                continue;
            }
            if(isVowel(Character.toLowerCase(ar[j]))){
                j--;
                continue;
            }
            
            tmp = ar[i];
            ar[i] = ar[j];
            ar[j] = tmp;
            i++;
            j--;
        }
        
        for(char c:ar)
            System.out.println(c);
	}
}