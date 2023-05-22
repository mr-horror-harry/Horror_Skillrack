import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n=sc.nextByte();
        
        int mt[][] = new int[n][n];
        
        for(byte i=0; i<n; i++)
            for(byte j=0; j<n; j++)
                mt[i][j]=sc.nextByte();
                
        for(int i=0,j=n-1, k=n-1,l=0; i<=k; i++,j--, k--,l++){
            int tmp=mt[i][j];
            mt[i][j]=mt[k][l];
            mt[k][l]=tmp;
        }
                
        for(byte i=0; i<n; i++){
            for(byte j=0; j<n; j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }
	}
}