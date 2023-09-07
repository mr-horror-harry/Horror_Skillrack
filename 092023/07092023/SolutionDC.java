import java.util.*;
public class Hello {
    
    public static boolean isAlpha(char c){
        return c>='a' && c<='z' || c>='A' && c<='Z';
    }
    
    private static String arrToString(char[] ar){
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : ar)
            if(c!='\0')
                sb.append(c);
        
        return sb.toString();
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), bal, i;
        char ar[];
        String res="", tmp;
        
        while(n-->0){
            
            ar = sc.next().toCharArray();
            
            bal=0;
            for(char c : ar)
                bal += isAlpha(c) ? 1 : -1;
            
            for(i=0; i<ar.length; i++){
                if(bal>=0){
                    if(!isAlpha(ar[i])){
                        ar[i]='\0';
                    }
                }
                else{
                    if(isAlpha(ar[i])){
                        ar[i]='\0';
                    }
                }
            }
            
            tmp = arrToString(ar);
            if(tmp.length() > res.length())
                res=tmp;
            
        }
        
        System.out.print(res);

	}
}