import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n=new Scanner(System.in).nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0&&j==0 || i==0&&j==n-1 || i==n-1&&j==n-1 || i==n-1&&j==0)
                    System.out.print("#");
                else if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(i==j || i+j==n-1 ? "*" :"-");   
            }
            System.out.println();
        }

	}
}