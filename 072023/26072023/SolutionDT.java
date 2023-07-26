import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        String s=new Scanner(System.in).next();
        int z=0, n=0, o=0, e=0, r=0;
        
        for(char c:s.toCharArray()){
            if(c=='z') z++;
            else if(c=='n') n++;
            else if(c=='o') o++;
            else if(c=='e') e++;
            else if(c=='r') r++;
        }
        
        o-=n;
        e-=n;
        
        o-=z;
        e-=z;
        
        if(z==r && o==0 && e==0){
            System.out.print("one".repeat(n) + "zero".repeat(z));
        }
        else{
            System.out.print(-1);
        }
        
	}
}