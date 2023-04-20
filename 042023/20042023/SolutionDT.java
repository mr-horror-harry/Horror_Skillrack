import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        
        int mt[][] = new int[m][n];
        
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                mt[i][j]=sc.nextInt();
                
        int res=0;
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                int sum=mt[i][j] + mt[i+1][j] + mt[i][j+1] + mt[i+1][j+1];
                res+= sum%2==1 ? 1 : 0;
            }
        }
        System.out.println(res);
        return;
	}
}