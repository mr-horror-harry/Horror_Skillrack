import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {

    public static void main(String[] args) {
        
        BufferedReader read;
        int n=0;
        try{
            read = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.valueOf(read.readLine().trim());
        }catch(Exception e){
            System.out.print(e);
        }
        
        boolean f;
        int x;
        System.out.print("1 ");
        for(int i=3; i<=n; i++){
            x=i;
            f=true;
            while(x>0){
                if(x%10 %2 == 0){
                    f=false;
                    break;
                }
                x/=10;
            }
            System.out.print(f ? i+" " : "");
        }
	}
}