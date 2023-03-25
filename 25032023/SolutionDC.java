// Using class and objects

import java.util.*;

class Function{
    void repeat(int n, int time){
        for(int i=0; i<time; i++) System.out.print(n+" ");
        System.out.println();
    }    
}

class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function func = new Function();
        
        int n = sc.nextByte(), limit = sc.nextByte();
        
        int i=1;
        while(i<=n){
            
            int times = i<=limit ? 2*i : i;
            
            func.repeat(i, times);
            i++;
        }
        
	}
}
