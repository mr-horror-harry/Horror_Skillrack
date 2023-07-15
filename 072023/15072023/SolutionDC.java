import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String>li = new ArrayList<String>();
        
        byte n = sc.nextByte();
        String s;
        
        li.add(sc.next());
        
        while(n-->1){
            
            s=sc.next();
            byte f=0;
            
            for(byte i=0; i<li.size(); i++)
                if(li.get(i).length() > s.length()){
                    f=1;
                    li.add(i, s);
                    break;
                }
            
            if(f==0) li.add(s);
            
        }
        
        Iterator itr = li.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
	}
}