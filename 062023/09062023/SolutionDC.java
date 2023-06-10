import java.util.Scanner;

class Solution{
    String s;
    Solution(String s){
        this.s=s;
    }
    
    boolean isBin(){
        for(char c:s.toCharArray())
            if(c>'1') return false;
        return true;
    }
    
    boolean isOct(){
        for(char c:s.toCharArray())
            if(c>'7') return false;
        return true;
    }
    
    boolean isDec(){
        for(char c:s.toCharArray())
            if(c>'9') return false;
        return true;
    }
    
    boolean isHex(){
        for(char c:s.toCharArray())
            if(c>'9' && (c<'A' || c>'F')) return false;
        return true;
    }
}

public class Hello {
    public static void main(String[] args) {
        
        Solution sol = new Solution(new Scanner(System.in).next());
        System.out.print(
                sol.isBin() ? "Binary":
                sol.isOct() ? "Octal":
                sol.isDec() ? "Decimal":
                sol.isHex() ? "Hexadecimal":
                            "Invalid"
            );
	}
}