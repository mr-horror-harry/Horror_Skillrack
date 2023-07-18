import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        
        int max=1;
        for(char c:ar){
            if(c-'0' > max){
                max=c-'0';
            }
        }
        
        int mt[][] = new int[max][ar.length];
        
        for(int j=0; j<ar.length; j++){
            int val=ar[j]-'0';
            for(int i=0; i<max; i++){
                if(val>0)
                    mt[i][j]=1;
                else
                    mt[i][j]=0;
                val--;
            }
        }
        
        for(int i=0; i<max; i++){
            for(int j=0; j<ar.length; j++){
                System.out.print(mt[i][j]);
            }
            System.out.println();
        }
        
	}
}