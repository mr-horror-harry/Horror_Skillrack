import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        String s;
        int l=0, f=0;
        
        for(int i=0; i<n; i++){
            
            s = sc.next();
            if(s.length()>=l){
                l=s.length();
            }
            else{
                f=1;
                break;
            }
            
        }
        System.out.print(f==1 ? "no" : "yes");

	}
}