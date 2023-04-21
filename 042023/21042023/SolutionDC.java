import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()/2;
        sc.nextLine();
        
        int res=0;
        while(n-->0){
            String e[] = sc.nextLine().split("\\s|\\:");
            String x[] = sc.nextLine().split("\\s|\\:");
            
            res+=timeDiff(e[1], e[2], x[1], x[2]);
        }
        
        res = res/60;
        System.out.print(res < 8 ? "no" : "yes");
	}
	
	
	static int timeDiff(String h1, String m1, String h2, String m2){
	    
	    byte h=(byte) (Byte.parseByte(h2)-Byte.parseByte(h1));
	    byte m=(byte) (Byte.parseByte(m2)-Byte.parseByte(m1));
	    
	    if(m<0){
	        h--;
	        m=(byte) (60+m);
	    } 
	    return h*60 + m;
	}
}