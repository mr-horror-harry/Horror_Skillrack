import java.util.*;
public class Hello {

    static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] a1=sc.next().toCharArray(), a2=sc.next().toCharArray();
        
        int v2=-1;
        for(int i=0; i<a1.length; i++){
            char x=Character.toLowerCase(a1[i]);
            if(isVowel(x)){
                for(int j=v2+1; j<a2.length; j++){
                    char y=Character.toLowerCase(a2[j]);
                    if(isVowel(y)){
                        char tmp = a1[i];
                        a1[i] = a2[j];
                        a2[j] = tmp;
                        
                        v2=j;
                        
                        break;
                    }
                }
            }
        }
        
        for(char c:a1) System.out.print(c);
        System.out.println();
        for(char c:a2) System.out.print(c);

	}
}