import java.util.*;
public class Hello {
    static class Solution{
        boolean isVow(char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        }
    }

    public static void main(String[] args) {
        
        char ar[] = new Scanner(System.in).next().toCharArray();
        Solution soln = new Solution();
        
        byte i=1;
        boolean f=true;
        for(char c:ar){
            if(soln.isVow(Character.toLowerCase(c))){
                f=false;
                System.out.print(i+ " ");
            }
            i++;
        }
        if(f){
            System.out.print(-1);
        }
	}
}