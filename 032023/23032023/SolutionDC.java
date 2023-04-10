import java.util.*;

class HelloDC {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        short n = sc.nextShort();
        int ar[]  = new int[n];
        
        short i=0;
        while(--n>=0){
            ar[n]=sc.nextInt();
            i++;   
        }
        
        short x = sc.nextShort();
        
        while(i-->0) System.out.print(ar[i]%2==0 ? ar[i]+x +" " : ar[i]-x +" ");
        
	}
}