import java.util.Scanner;
import java.util.Arrays;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte n=sc.nextByte();
        byte k=sc.nextByte();
        int ar[]=new int[n];
        for(byte i=0; i<n; i++) ar[i]=sc.nextInt();
        
        Arrays.sort(ar);
        
        int res=0;
        while(k-->0)
            res+=ar[--n];
            
        System.out.print(res);
        return;
	}
}