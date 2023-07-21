import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        HashMap<Character, Integer>map = new HashMap<>();
        
        String s = new Scanner(System.in).next();
        char ar[] = s.toCharArray();
        int max=1;
        
        for(char c : ar)
            map.put(c, 0);
        
        for(char c : ar){
            int inc = map.get(c)+1;
            map.put(c, inc);
            if(inc > max){
                max=inc;
            }
        }
        
        if(max==1){
            System.out.print(s);
            return;
        }
        
        byte f=0;
        for(char c:ar){
            if(map.get(c)!=max){
                System.out.print(c);
                f=1;
            }
        }
        if(f==0) System.out.print(-1);
    }
}