import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte m=sc.nextByte(), n=sc.nextByte(), i, j;
        
        int mt[][] = new int[m][n];
        
        for(i=0; i<m; i++)
            for(j=0; j<n; j++){
                mt[i][j]=sc.nextInt();
                if(j>0){
                    if(mt[i][j-1]>=mt[i][j]){
                        System.out.print("NO");
                        return;
                    }
                }
            }
          
        for(j=0; j<n; j++)
            for(i=1; i<m; i++){
                if(mt[i-1][j]>=mt[i][j]){
                    System.out.print("NO");
                    return;
                }
            }
        System.out.print("YES");
	}
}