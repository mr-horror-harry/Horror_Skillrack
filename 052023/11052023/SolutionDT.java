import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List <Integer> l1 = new ArrayList<>();
        
        short m=sc.nextShort(), n=sc.nextShort();
        int x;
        
        for(short i=0; i<m; i++){
            x=sc.nextInt();
            l1.add(x);
        }
        
        while(n>0){
            x=sc.nextInt();
            for(short i=(short)(l1.size()-1); i>=0; i--){
                if(l1.get(i)==x){
                    l1.remove(i);
                    break;
                }
            }
            n--;
        }
        
        for(int i:l1) System.out.print(i+" ");

	}
}