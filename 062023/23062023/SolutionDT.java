import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int mat[][] = new int[n][n];
        
        int val=1;
        
        for(int i=0; i<n && val<=x; i++){
            mat[i][0]=val++;
        }

        for(int j=1; j<n && val<=x; j++){
            mat[n-1][j]=val++;
        }
        
        for(int i=n-2; i>=0 && val<=x; i--){
            mat[i][n-1]=val++;
        }
        
        for(int j=n-2; j>=1 && val<=x; j--){
            mat[0][j]=val++;
        }
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
                    System.out.print(i==0 || j==0 || i==n-1 || j==n-1 ? "* " : "- ");
                }
                else{
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
	}
}