import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int mt[][] = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                mt[i][j]=sc.nextInt();
        
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(mt[i][j]!=mt[j][i]){
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.print("YES");

	}
}