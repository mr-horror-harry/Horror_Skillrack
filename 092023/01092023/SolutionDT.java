import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt(), x, i, res=0;
        List <Integer> li = new ArrayList<>();
        
        for(i=0; i<n; i++){
            x = sc.nextInt();
            
            if(x%2==0)
                res+=x;
            else
                li.add(x);
        }
        
        Collections.sort(li);
        
        for(int elt : li)
            res += elt;
        
        if(li.size()%2==1) 
            res -= li.get(0);
            
        System.out.print(res);
	}
}