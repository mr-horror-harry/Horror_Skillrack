import java.util.*;

class Solution{
    boolean isCons(char c){
        return !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}

public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = sc.nextInt();
        
        Solution soln = new Solution();
        StringBuilder sb = new StringBuilder("");
        
        int i=0;
        while(n > 0 && i<s.length()){
            char x=Character.toLowerCase(s.charAt(i));
            if(soln.isCons(x)){
                sb.append(s.charAt(i));
                n--;
            }
            i++;
        }
        
        System.out.print(n==0 ? sb : -1);

	}
}