import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        String s;
        char min;
        while(n-->0){
            s = sc.next();
            min = 'z';
            for(char c : s.toCharArray()){
                if( c < min ){
                    min = c;
                }
            }
            System.out.print(min + " ");
        }
	}
}