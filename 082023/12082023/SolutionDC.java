import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int hash[] = new int[1001];
        int conf[] = new int[1001];
        
        Scanner sc = new Scanner(System.in);
        
        char ar[] = sc.next().toCharArray();
        int n = sc.nextInt();
        boolean f=true;
        
        for(char c:ar)
            hash[c]++;
        
        for(char c:ar)
            if(hash[c]>=n && conf[c]==0){
                System.out.print(c);
                conf[c]=1;
                f=false;
            }
        
        if(f)
            System.out.print(-1);
        
	}
}