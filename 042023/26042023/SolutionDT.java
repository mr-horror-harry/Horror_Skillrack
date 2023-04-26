import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n=sc.nextByte();
        
        int ar[] = new int[n];
        int max=0;
        for(byte i=0; i<n; i++){
            ar[i]=sc.nextInt();
            if(ar[i]>max) max=ar[i];
        }
        
        int div=0;
        while(max>0){
            div += max%10;
            max/=10;
        }
        
        for(byte i=0; i<n; i++){
            System.out.printf("%.2f ",(ar[i]+0.0)/div);
        }
        
	}
}