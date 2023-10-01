import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n=new Scanner(System.in).nextInt(), val=1;
        int mat[][] = new int[n][n];
        
        int i=n-1, j=0, ti, tj, r=0;
        
        while(i>=j){
            
            for(ti=r; ti<=i; ti++)
                mat[ti][j]=val;
            
            for(tj=j; tj<n; tj++)
                mat[i][tj]=val;
                
            i--;
            j++;
            r++;
            val++;
        }
        
        for(i=0; i<n; i++){
            for(j=0; j<=i; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        
	}
}