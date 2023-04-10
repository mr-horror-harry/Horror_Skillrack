import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ar[] = new int[n];
        for(int i=0; i<n; i++) ar[i]=sc.nextInt();
        
        for(int i=0; i<n; i++){
            
            if(ar[i]%2==0){
                for(int j=i+1; j<n; j++){
                    if(ar[j]%2==0){
                        if(ar[i]>ar[j]){
                            int tmp = ar[i];
                            ar[i] = ar[j];
                            ar[j] = tmp;
                        }
                    }
                }
            }
            
            System.out.print(ar[i]+" ");
            
        }

	}
}