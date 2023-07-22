import java.util.*;
public class Hello {
    static boolean isCons(char c){
        return !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt(), ct=0, max=0;
        String s, res="";
        
        while(n-->0){
            s = sc.next();
            ct=0;
            for(char c : s.toCharArray())
                if(isCons(Character.toLowerCase(c)))
                    ct++;
            
            if(ct>max){
                max=ct;
                res=s;
            }
        }
        System.out.print(res);
	}
}