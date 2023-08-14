import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextByte();
        
        List<Integer> li = new LinkedList<>();
        
        while(n-->0)
            li.add(sc.nextInt());


        for(int x:li)
            if(li.contains(x) && li.contains(-1*x))
                System.out.print(x+" ");
	}
}