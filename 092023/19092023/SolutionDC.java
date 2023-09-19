import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        Map <Character, Integer> map = new HashMap<>();
        
        map.put('a',0); map.put('e',0); map.put('i',0); map.put('o', 0); map.put('u',0);
        
        for(char c:ar){
            try{
                map.put(c, map.get(c)+1);
            }
            catch(Exception e){}
        }
        
        for(char c:ar){
            try{
                if(map.get(c)==1)
                    System.out.print(c);
            }
            catch(Exception e){
                System.out.print(c);
            }
        }
        
	}
}