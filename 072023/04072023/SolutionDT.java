import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int ar[] = new int[n];
        for(int i=0; i<n; i++){
            ar[i]=sc.nextInt();
        }
        
        int tmp;
        for(int i=0; i<n; i++){
            tmp=1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    tmp*=ar[j];
                }
            }
            
            System.out.print(tmp+" ");
        }
        
        
	}
}