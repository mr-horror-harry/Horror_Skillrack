import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        int min=0, max=5, minCt=0, maxCt=0;         // min->from mon, max->from sat
                                                    // eff with m, m+5 check
        while(n-->0){
            if(min%7==5 || min%7==6) minCt++;           // check sat or sun
            if(max%7==5 || max%7==6) maxCt++;
            min++;
            max++;
        }
        System.out.print(minCt+" "+maxCt);
	}
}