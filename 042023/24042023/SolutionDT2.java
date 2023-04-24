// New Approach using
//     1) ArrayList
//     2) Iterator
//     3) Class-Object
//     4) User repeat Method

import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        stringClass str = new stringClass();
        
        int n=sc.nextInt();
        
        String s;
        int max=0;
        
        List <String> li = new ArrayList<>();
        for(int i=0; i<n; i++){
            s=sc.next();
            if(s.length() > max) max = s.length();
            
            li.add(s);
            
        }
        
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            s=itr.next().toString();
            System.out.println( stringClass.repeatChar( '*' ,  max-s.length()) + s );
        }

	}
}




class stringClass{
    
    static String repeatChar(char c, int n){
        
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<n; i++){
            res.append(c);
        }
        
        return res.toString();
    }
    
}