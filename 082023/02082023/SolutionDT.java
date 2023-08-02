import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i, j, n = sc.nextInt();
        String ar[] = new String[n];
        
        for(i=0; i<n; i++){
            ar[i]=sc.next();
        }
        
        int l=ar[0].length(), f;
        
        for(j=0; j<l; j++){
            f=0;
            for(i=0; i<n; i++){
                if(ar[i].charAt(j)!=ar[0].charAt(j)){
                    f=1;
                    break;
                }
            }
            
            if(f==0){
                System.out.print(ar[0].charAt(j));
            }
        }

	}
}