import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String tmp[] = sc.nextLine().split(" ");
        int x = sc.nextInt();
        
        int ar[] = new int[tmp.length];
        for(int i=0; i<ar.length; i++){
            ar[i]=Integer.parseInt(tmp[i]);
        }
        
        int l, r;
        for(int i=0; i<ar.length; i++){
            l=0;
            r=0;
            if(ar[i]==x){
                for(int j=0; j<i; j++){
                    l+=ar[j];
                }
                
                for(int j=i+1; j<ar.length; j++){
                    r+=ar[j];
                }
                
                System.out.print(l<=r ? l : r);
                return;
            }
        }

	}
}