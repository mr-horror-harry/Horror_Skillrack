import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int n=sc.nextInt(), x=sc.nextInt();
        String ar[] = new String[n];
        
        for(int i=0; i<n; i++){
            ar[i]=sc.next();
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                
                int v = ar[i].compareTo(ar[j]);
                
                if(v<0){
                    String tmp = ar[j];
                    ar[j]=ar[i];
                    ar[i]=tmp;
                }
            }
        }
        
        for(int i=0; i<x; i++) System.out.println(ar[i]);

	}
}