import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        for(char c : new Scanner(System.in).next().toCharArray()){
            if(c-'0'>7){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
	}
}