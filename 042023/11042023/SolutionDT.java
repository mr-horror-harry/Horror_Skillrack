import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        char mt[][]=new char[m][n];
        
        for(int i=0; i<m; i++){
            String s =sc.next();
            for(int j=0; j<n; j++)
                mt[i][j]=s.charAt(j);
        }
        
        int rlen=0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mt[i][j]=='*'){
			
                    int k=j, len=0;
                    
                    while(k<n && mt[i][k]=='*'){
                        len++;
                        k++;
                    }
                    
                    if(len>rlen) rlen=len;
                }
            }
        }
        
        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                if(mt[i][j]=='*'){
                    
                    int k=i, len=0;
                    
                    while(k<m && mt[k][j]=='*'){
                        len++;
                        k++;
                    }
                    
                    if(len>rlen) rlen=len;
                }
            }
        }
        System.out.print(rlen);

	}
}
