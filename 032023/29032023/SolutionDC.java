import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution soln = new Solution(new Scanner(System.in).next());
        soln.finDist();
        
        int ans = soln.res;
        System.out.print(ans >= 0 ? ans : ans*(-1));
        
    }
}

class Solution{
    int res=0;
    String s;
    
    Solution(String str){
        s=str;
    }
    
    void finDist(){
        for(char c : s.toCharArray()){
            res += c=='+' ? 1 : -1;
        }
    }
}