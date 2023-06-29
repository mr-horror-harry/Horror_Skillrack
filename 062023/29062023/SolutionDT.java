import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        byte n= sc.nextByte();
        char[][] mat = new char[n][n];
        
        byte i,j, ptr, f, cf, k;
        short ct=0;
        for(i=0; i<n; i++)
            for(j=0; j<n; j++)
                mat[i][j] = sc.next().charAt(0);
        
        String s = sc.next();
        
        for(j=0; j<n; j++){
            cf=0;
            for(i=0; i<n; i++){
                ptr=0;
                if(s.charAt(ptr) == mat[i][j]){
                    f=0;
                    k=i;
                    while(ptr<s.length() && k<n){
                        if(s.charAt(ptr) != mat[k][j]){
                            f=1;
                            break;
                        }
                        ptr++;
                        k++;
                    }
                    
                    if(f==0 && ptr==s.length()){
                        ct=1;
                        cf=1;
                        System.out.print(j+1 + " ");
                    }
                }
                if(cf==1){
                    break;
                }
            }
        }
        System.out.print(ct==0 ? "" : "-1");

	}
}
