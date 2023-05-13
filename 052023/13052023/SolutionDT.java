import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        byte n = sc.nextByte(), ct=n;
        
        char c='a';
        
        while(ct>0 && c<='z'){
            
            int cCt=0;
            for(int j=0; j<sb.length(); j++){
                if(c == sb.charAt(j)){
                    cCt++;
                }
            }
            if(cCt > 1){
                ct--;
            }
            c++;
        }
        
        c--;
        
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i)==c){
                sb.deleteCharAt(i);
            }
        }
        System.out.print(!sb.toString().equals("") ? sb : -1);
    }
}