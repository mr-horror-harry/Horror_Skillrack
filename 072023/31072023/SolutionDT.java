import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int m1[][]=new int[n][n], m2[][]=new int[n][n], i, j, tmp;
        
        for( i=0; i<n; i++)
            for( j=0; j<n; j++)
                m1[i][j]=sc.nextInt();
        
        for( i=0; i<n; i++)
            for( j=0; j<n; j++)
                m2[i][j]=sc.nextInt();
        
        for( i=0; i<n/2; i++)
            for( j=n/2; j<n; j++){
                tmp=m1[i][j];
                m1[i][j]=m2[i][j];
                m2[i][j]=tmp;
                
                tmp=m1[j][i];
                m1[j][i]=m2[j][i];
                m2[j][i]=tmp;
            }
        
        for(i=0; i<n; i++){
            for(j=0; j<n; j++)
                System.out.print(m1[i][j]+" ");
            System.out.println();
        }
        
        for(i=0; i<n; i++){
            for(j=0; j<n; j++)
                System.out.print(m2[i][j]+" ");
            System.out.println();
        }
            
	}
}