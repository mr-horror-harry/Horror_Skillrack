import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        int row = n%2==0 ? n/2 : n/2 + 1;
        int val = n%2==0 ? 2 : 1;
        int dash=0, col;
        
        while(row > 0){
            
            //Dash portion
            System.out.print("-".repeat(dash++));
            
            // Numbers portion
            col = row;
            while(col > 0){
                System.out.print(col!=1 ? val+"*" : val);
                val+=2;
                col--;
            }
            System.out.println();
            row--;
            
        }
	}
}
