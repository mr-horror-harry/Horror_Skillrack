import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        
        int ar[] = new int[n];
        for(byte i=0; i<n; i++) ar[i]=sc.nextInt();
        
        int tmp;
        for(byte i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(ar[i]%10 < ar[j]%10){
                    tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                }
                else if(ar[i]%10 == ar[j]%10){
                    if(ar[i] < ar[j]){
                        tmp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = tmp;
                    }
                }
            }
        }
        
        for(int i:ar) System.out.print(i+ " ");

	}
}