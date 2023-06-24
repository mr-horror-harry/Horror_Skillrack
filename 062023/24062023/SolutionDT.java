import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int ar[] = new int[n];
        int max=0, ind=0;
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
            if(ar[i] > max){
                max = ar[i];
                ind=i;
            }
        }
        
        int compMax=0;
        for(int i=0; i<n; i++){
            if(i!=ind){
                if(x*ar[i] > compMax){
                    compMax=x*ar[i];
                }
            }
        }
        
        System.out.print(max >= compMax ? max : -1);
        
	}
}