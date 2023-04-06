import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m=sc.nextInt(), n=sc.nextInt();
        
        int mt[][] = new int[m][n];
        
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                    mt[i][j]=sc.nextInt();

        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                
                for(int k=i+1; k<m; k++){
                    if(mt[k][j] < mt[i][j]){
                        int tmp = mt[k][j];
                        mt[k][j] = mt[i][j];
                        mt[i][j] = tmp;
                    }
                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }
	}
}