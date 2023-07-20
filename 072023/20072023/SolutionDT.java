import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m=sc.nextInt(), n=sc.nextInt(), i ,j;
        int m1[][] = new int[m][n], m2[][] = new int[m][n];
        
        for(i=0; i<m; i++)
            for(j=0; j<n; j++)
                m1[i][j]=sc.nextInt();
        
        for(i=0; i<m; i++)
            for(j=0; j<n; j++)
                m2[i][j]=sc.nextInt();
                
        byte f=0;
        for(i=0; i<m; i++){
            if(f==0){
                f=1;
                for(j=0; j<n; j++){
                    System.out.print(m1[i][j]+" ");
                }
            }
            else{
                f=0;
                for(j=0; j<n; j++){
                    System.out.print(m2[i][j]+" ");
                }
            }
            System.out.println();
        }        
	}
}