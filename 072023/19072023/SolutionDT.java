import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte(), i, j;
        int mt[][] = new int[n][n];
        
        for(i=0; i<n; i++)
            for(j=0; j<n; j++)
                mt[i][j]=sc.nextInt();
        
        
        if(n%2==0){
            for(i=0; i<n; i++)
                System.out.print(mt[i][0]+" ");
            System.out.println();
            for(i=0; i<n; i++)
                System.out.print(mt[i][n-1]+" ");
            
            return;
        }
        
        for(j=0; j<n; j++)
            System.out.print(mt[0][j]+" ");
        System.out.println();
        for(j=0; j<n; j++)
            System.out.print(mt[n-1][j]+" ");
        
	}
}