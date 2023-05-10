import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read;
        try{
            read = new BufferedReader(new InputStreamReader(System.in));
            String ar[] = read.readLine().split(" ");
            
            int n=Integer.parseInt(ar[0]),
                x=Integer.parseInt(ar[1]),
                y=Integer.parseInt(ar[2]),
                z=Integer.parseInt(ar[3]);
                
            for(int i=1; i<=n; i++){
                System.out.print(i%x==0 && i%y==0 || i%y==0 && i%z==0 || i%z==0 && i%x==0 ? i+" " : "");
            }
            
        }
        catch(Exception e){
            System.out.print(e);
        }
	}
}