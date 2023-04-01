import java.util.*;
class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int i=s.length()-1;
        
        int res=0;
        for(char c:s.toCharArray()){
            res += (c-'0')%2==1 ? Math.pow(2, i) : 0;
            i--;
        }
        System.out.print(res);

	}
}