import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt(), i, j;
        int ar[] = new int[n];
        
        for(i=0; i<n; i++)
            ar[i]=sc.nextInt();
            
        int x=sc.nextInt(), tmp;
        
        for(i=0; i<n; i++){
            if(ar[i]/10%10 == x){
                
                for(j=i+1; j<n; j++){
                    if(ar[j]/10%10==x){
                        
                        if(ar[i] > ar[j]){
                            tmp = ar[i];
                            ar[i] = ar[j];
                            ar[j] = tmp;
                        }
                        
                    }
                }
            
            }
        }
        
        for(int a:ar)
            System.out.print(a+ " ");
	}
}s