import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        
        int mt[][] = new int[r][c];
        
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                mt[i][j]=sc.nextInt();
                
        
        for(int i=0; i<=r/2; i++){
            for(int j=0; j<c; j++){
                if(mt[i][j] != mt[r-i-1][j]){
                    System.out.print("NO");
                    return;
                }
            }
        }
        
        System.out.print("YES");s
	}
}