import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int[][] mt = new int[n][n];
        
        int o=1, e=2;
        
        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                if(i<j){
                    mt[i][j]=o;
                    o+=2;
                }
                else if(i>j){
                    mt[i][j]=e;
                    e+=2;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print(mt[i][j]+" ");
                
            System.out.println();
        }
	}
}