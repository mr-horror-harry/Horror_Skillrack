import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int n = new Scanner(System.in).nextInt();
	    
	    int s=0, f=1;
	    
	    while(n-->0){
	        System.out.print(Integer.toBinaryString(s) + " ");
	        
	        int tmp = f+s;
	        s = f;
	        f = tmp;
	    }
	    
	}
}
