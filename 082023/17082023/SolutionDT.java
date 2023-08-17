import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), i, x, max=-1, pos=0;
        
        String ar[] = new String[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(i=0; i<n; i++){
            map.put(i, 0);
            ar[i]=sc.next();
        }
        
        while(sc.hasNext()){
            x = sc.nextInt();
            map.put(x, map.get(x)+1);
            
            if(map.get(x)>max){
                max=map.get(x);
                pos=x;
            }
            else if(map.get(x)==max)
                if(x<pos)
                    pos=x;
        }
        System.out.print(ar[pos]);
	}
}