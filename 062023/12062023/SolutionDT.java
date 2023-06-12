import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt(), x = sc.nextInt();
        List<Integer>li = new ArrayList<>();
        
        while(n-->0) li.add(sc.nextInt());
        
        Collections.sort(li);
        
        n = li.get(0);
        li.remove(0);
        li.add(x-1, n);
        
        for(int i:li) System.out.print(i+ " ");
	}
}