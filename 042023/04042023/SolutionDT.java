import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte n = sc.nextByte();
        int min=10000001, max=0;
        while(n-- > 0){
            int x = sc.nextInt();
            if(x%2==0 && x>max){
                max=x;
            }
            else if(x%2==1 && x<min){
                min=x;
            }
        }
        
        //System.out.print(min+" "+max);
        if(min<=max){
            while(min<=max) System.out.print(min++ + " ");
        }
        else{
            while(max<=min) System.out.print(max++ + " ");
        }

	}
}