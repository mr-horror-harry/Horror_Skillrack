import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Short>li = new LinkedList<>();
        
        byte n = sc.nextByte(),fS=0, fD=0;
        short x;
        while(n-->0){
            x=sc.nextShort();
            if(x<10){
                fS=1;
                System.out.print(x+" ");
                continue;
            }
            else if(x>9 && x<100){
                fD=1;
                li.add(x);
            }
        }
        
        System.out.println(fS==1 ? "" : -1);
        if(fD==0){
            System.out.print(-1);
            return;
        }
        for(short i:li){
            System.out.print(i+" ");
        }
	}
}