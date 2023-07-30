import java.util.*;
public class Hello {
    
    public static boolean isVow(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        
        int n=ar.length;
        for(int i=0; i<n; i++){
            if(isVow(ar[i])){
                for(int j=i+1; j<n; j++){
                    
                    if( !isVow(ar[j]) ){
                        if(Character.isUpperCase(ar[j])){
                            ar[j] = Character.toLowerCase(ar[j]);
                        }
                        else if(Character.isLowerCase(ar[j])){
                            ar[j] = Character.toUpperCase(ar[j]);
                        }
                        break;
                    }
                    
                }
            }
        }
        
        for(char c : ar)
            System.out.print(c);

	}
}